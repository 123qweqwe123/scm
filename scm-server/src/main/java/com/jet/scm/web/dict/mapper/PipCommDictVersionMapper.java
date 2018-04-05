package com.jet.scm.web.dict.mapper;

import com.jet.scm.web.dict.domain.JetCommDictVersionLog;
import com.jet.scm.web.dict.domain.PipCommDictVersion;
import com.jet.scm.web.dict.domain.PipCommDictVersionExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PipCommDictVersionMapper {
    int insert(PipCommDictVersion record);

    int insertSelective(PipCommDictVersion record);

    List<PipCommDictVersion> selectByExample(PipCommDictVersionExample example);

    int updateByExampleSelective(@Param("record") PipCommDictVersion record, @Param("example") PipCommDictVersionExample example);

    int updateByExample(@Param("record") PipCommDictVersion record, @Param("example") PipCommDictVersionExample example);

    PipCommDictVersion selectByPrimaryKey(String id);

    int updateByPrimaryKey(PipCommDictVersion record);

    int updateByPrimaryKeySelective(PipCommDictVersion record);

    List<JetCommDictVersionLog> selectLogByExample(PipCommDictVersionExample example);

}