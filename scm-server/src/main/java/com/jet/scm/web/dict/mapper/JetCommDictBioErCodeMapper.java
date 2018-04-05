package com.jet.scm.web.dict.mapper;

import com.jet.scm.web.dict.domain.JetCommDictBioErCode;
import com.jet.scm.web.dict.domain.JetCommDictBioErCodeExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JetCommDictBioErCodeMapper {
    int countByExample(JetCommDictBioErCodeExample example);

    int deleteByExample(JetCommDictBioErCodeExample example);

    int insert(JetCommDictBioErCode record);

    JetCommDictBioErCode selectByPrimaryKey(String id);

    int insertSelective(JetCommDictBioErCode record);

    List<JetCommDictBioErCode> selectByExample(JetCommDictBioErCodeExample example);

    int updateByExampleSelective(@Param("record") JetCommDictBioErCode record, @Param("example") JetCommDictBioErCodeExample example);

    int updateByExample(@Param("record") JetCommDictBioErCode record, @Param("example") JetCommDictBioErCodeExample example);

    List<JetCommDictBioErCode> selectBioErCodeList(JetCommDictBioErCode pipCommDictBioErCode);

}