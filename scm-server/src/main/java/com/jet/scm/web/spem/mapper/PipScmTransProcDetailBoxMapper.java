package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransProcDetailBox;
import com.jet.scm.web.spem.domain.PipScmTransProcDetailBoxExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransProcDetailBoxMapper {
    int insert(PipScmTransProcDetailBox record);

    int insertSelective(PipScmTransProcDetailBox record);

    List<PipScmTransProcDetailBox> selectByExample(PipScmTransProcDetailBoxExample example);

    PipScmTransProcDetailBox selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcDetailBox record, @Param("example") PipScmTransProcDetailBoxExample example);

    int updateByExample(@Param("record") PipScmTransProcDetailBox record, @Param("example") PipScmTransProcDetailBoxExample example);
}