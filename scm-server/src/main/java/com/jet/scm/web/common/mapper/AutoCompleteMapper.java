package com.jet.scm.web.common.mapper;

import com.jet.scm.web.common.qo.AutoCompleteQO;
import com.jet.scm.web.common.vo.AutoCompleteVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AutoCompleteMapper {

    List<AutoCompleteVO> selectComboxData(AutoCompleteQO qo);
}
