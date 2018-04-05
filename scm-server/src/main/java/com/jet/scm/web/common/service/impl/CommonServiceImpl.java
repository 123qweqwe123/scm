package com.jet.scm.web.common.service.impl;

import com.jet.scm.core.constant.AppConsts;
import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.thirdservice.fdfs.FileService;
import com.jet.scm.web.common.domain.SysParameter;
import com.jet.scm.web.common.domain.SysParameterExample;
import com.jet.scm.web.common.mapper.SysParameterMapper;
import com.jet.scm.web.common.qo.AutoCompleteQO;
import com.jet.scm.web.common.service.CommonService;
import com.jet.scm.web.common.vo.AutoCompleteVO;
import com.jet.scm.web.common.vo.SelectVO;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.csource.common.NameValuePair;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 *     模块共通插件调用
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/24 下午2:53
 */
@Service
public class CommonServiceImpl implements CommonService {

    Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

    @Autowired
    private SysParameterMapper sysParameterMapper;

    @Autowired
    private FileService fileService;
    /**
     * 下拉框限制条数
     */
    private static final int COMBOX_LIMIT = 15;
    /**
     * 自动补全对应 mybatis statement
     */
    private static final String autoCompleteStatement = "com.jet.scm.web.common.mapper.AutoCompleteMapper.selectComboxData";
    private static Map<String, AutoCompleteQO> autoCompleteSqlStats = Maps.newHashMap();

    private final SqlSessionTemplate sessionTemplate;

    {
        // 下拉框
        autoCompleteSqlStats.put("ac1", new AutoCompleteQO("SYS_ACCOUNT"));
        autoCompleteSqlStats.put("ac2", new AutoCompleteQO("SYS_ROLE"));
        autoCompleteSqlStats.put("ac3", new AutoCompleteQO("RCC_CODE", "RCC_NAME", "RCC_CODE||HELP_CODE", "PIP_COMM_RCC"));
        autoCompleteSqlStats.put("ac4", new AutoCompleteQO("ID", "NAME", "LOGIN_NAME", "PIP_SYS_ACCOUNT"));
    }

    @Autowired
    public CommonServiceImpl(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }


    /**
     * 自动补全选择框
     *
     * @param q
     * @param s
     * @param limit
     * @return
     */
    @Override
    public List<AutoCompleteVO> queryAutoComplete(String q, String s, Integer limit) {
        if (limit == null) {
            limit = COMBOX_LIMIT;
        }
        if (StringUtils.isNotBlank(q)) {
            q = ('%' + q + '%').toUpperCase();
        } else {
            q = null;
        }
        RowBounds rb = new RowBounds(0, limit);

        return sessionTemplate.selectList(autoCompleteStatement, autoCompleteSqlStats.get(s).setQ(q), rb);
    }

    /**
     * 下拉框，设置缓存
     *
     * @param q
     * @return
     */
    @Override
    @Cacheable(value = "param", key = "#q")
    public List<SelectVO> querySelect(String q) {
        SysParameterExample exp = new SysParameterExample();
        exp.createCriteria().andTypeEqualTo(q).andIsValidEqualTo(AppConsts.TRUE);
        exp.setOrderByClause(" SEQUENCE");
        List<SysParameter> parameters = sysParameterMapper.selectByExample(exp);
        List<SelectVO> results = parameters.stream().map(x -> {
            SelectVO vo = new SelectVO();
            vo.setCode(x.getCode());
            vo.setValue(x.getValue());
            return vo;
        }).collect(Collectors.toList());
        return results;
    }


    @Override
    public String upload(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String extName = StringUtils.substringAfterLast(fileName, ".");
        try {
            NameValuePair[] pairs = new NameValuePair[1];
            pairs[0] = new NameValuePair("name", fileName);
            return fileService.uploadFile(file.getBytes(), extName, pairs);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("文件上传失败，文件名：{}", fileName);
            throw new ServiceException("上传失败，请联系管理员!");
        }
    }

    @Override
    public byte[] download(String fileId) {
        return fileService.downloadFile(fileId);
    }

    @Override
    public Map<String, Object> downloadWithMetaData(String fileId) {
        return fileService.downloadFileWithMetaData(fileId);
    }
}
