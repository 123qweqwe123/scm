package com.jet.scm.web.dict.mapper;

import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.JetCommDictVersionLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JetCommDictVersionLogMapper {
    int countByExample(JetCommDictVersionLogExample example);

    int deleteByExample(JetCommDictVersionLogExample example);

    int insert(JetCommDictVersionLog record);

    int insertSelective(JetCommDictVersionLog record);

    List<JetCommDictVersionLog> selectByExample(JetCommDictVersionLogExample example);

    int updateByExampleSelective(@Param("record") JetCommDictVersionLog record, @Param("example") JetCommDictVersionLogExample example);

    int updateByExample(@Param("record") JetCommDictVersionLog record, @Param("example") JetCommDictVersionLogExample example);
}