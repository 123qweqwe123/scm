package com.jet.scm.web.dict.service.impl;


import com.google.common.collect.Lists;
import com.jet.scm.core.exception.ValidatorException;
import com.jet.scm.core.utils.PinyingUtils;
import com.jet.scm.core.utils.Securitys;
import com.jet.scm.core.utils.Utils;
import com.jet.scm.web.dict.domain.JetCommDictBioErCode;
import com.jet.scm.web.dict.domain.JetCommDictBioErCodeExample;
import com.jet.scm.web.dict.mapper.JetCommDictBioErCodeMapper;
import com.jet.scm.web.dict.service.DictBioErCodeService;
import com.jet.scm.web.dict.vo.ErrCodeVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/4
 */

@Service
public class DictBioErCodeServiceImpl implements DictBioErCodeService {

	@Value("${Props.bioErrCode-dictCode}")
	String dictCode;

    @Autowired
	JetCommDictBioErCodeMapper dictBioErCodeMapper;

    @Override
    public List<JetCommDictBioErCode> getBioErrorCodeList(JetCommDictBioErCode errorCode) {
        return dictBioErCodeMapper.selectBioErCodeList(errorCode);
    }

    @Override
    public JetCommDictBioErCode selectByPrimaryKey(String id) {
        return dictBioErCodeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void validateVcode(JetCommDictBioErCode errorCode) {
        List<JetCommDictBioErCode> list = dictBioErCodeMapper.selectBioErCodeList(errorCode);
        if (list.size() > 0) {
            throw new ValidatorException("错误编码已存在");
        }
    }

	@Override
	public int createOrUpdate(JetCommDictBioErCode record) {
		record.setUpdateBy(Securitys.getUser().getName());
		record.setUpdateDate(new Date());

		if(StringUtils.isNotEmpty(record.getVname())) {
			record.setHelpCode(PinyingUtils.getJM(record.getVname()));
		}

		// 根据父节点code获取父节点id
		if(StringUtils.isNotEmpty(record.getParentId())) {
			JetCommDictBioErCodeExample exp = new JetCommDictBioErCodeExample();
			exp.createCriteria().andVcodeEqualTo(record.getParentId());
			List<JetCommDictBioErCode> list = dictBioErCodeMapper.selectByExample(exp);
			if(list != null && list.size()>0 ) {
				JetCommDictBioErCode errCode = list.get(0);
				record.setParentId(errCode.getId());
			}
		}

		// 根据编码获取父类编码
		if (StringUtils.isNotEmpty(record.getVcode())) {
			String code = record.getVcode();
			if(code.length() > 2 && code.length() % 2 == 1) {
				record.setDictName(code.substring(0, code.length()-2));
			} else if(code.length() > 3 && code.length() % 2 == 0) {
				record.setDictName(code.substring(0, code.length()-3));
			}
		}

		if (StringUtils.isNotEmpty(record.getId())) {
			JetCommDictBioErCodeExample example = new JetCommDictBioErCodeExample();
			example.createCriteria().andIdEqualTo(record.getId());
			return dictBioErCodeMapper.updateByExampleSelective(record, example);
		} else {
			record.setId(Utils.generateUUID());
			record.setDictCode(dictCode);
			record.setCreateBy(Securitys.getUser().getName());
			record.setCreateDate(new Date());
			record.setIsRemoved((short) 0);
			return dictBioErCodeMapper.insert(record);
		}
	}

	public List<?> queryErrCodes() {
		JetCommDictBioErCodeExample exp = new JetCommDictBioErCodeExample();
		exp.createCriteria().andIsRemovedNotEqualTo((short) 1);
		exp.setOrderByClause("VCODE ASC");
		List<ErrCodeVO> errCodeTree = Lists.newArrayList();
		dictBioErCodeMapper.selectByExample(exp).forEach(el -> {
			ErrCodeVO errCode = new ErrCodeVO();
			errCode.setLabel(el.getVname());
			errCode.setValue(el.getVcode());
			if (StringUtils.isNotEmpty(el.getParentId())) {
				errCode.setParentId(el.getVcode().substring(0,1));
			}
			errCodeTree.add(errCode);
		});
		return errCodeTree;
	}


}
