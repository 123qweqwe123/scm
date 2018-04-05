package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransEmail;
import com.jet.scm.web.spem.domain.PipScmTransEmailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransEmailMapper {
    int insert(PipScmTransEmail record);

    int insertSelective(PipScmTransEmail record);

    List<PipScmTransEmail> selectByExample(PipScmTransEmailExample example);

    PipScmTransEmail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransEmail record, @Param("example") PipScmTransEmailExample example);

    int updateByExample(@Param("record") PipScmTransEmail record, @Param("example") PipScmTransEmailExample example);

    int updateByPrimaryKeySelective(PipScmTransEmail record);

    int updateByPrimaryKey(PipScmTransEmail record);
}