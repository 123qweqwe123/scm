package com.jet.scm.web.common.service;

import com.jet.scm.web.common.vo.AutoCompleteVO;
import com.jet.scm.web.common.vo.SelectVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 *     封装一些共通的操作
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/24 下午2:43
 */
public interface CommonService {


    List<AutoCompleteVO> queryAutoComplete(String q, String s, Integer limit);

    List<SelectVO> querySelect(String q);

    String upload(MultipartFile file);


    byte[] download(String fileId);

    Map<String, Object> downloadWithMetaData(String fileId);

}
