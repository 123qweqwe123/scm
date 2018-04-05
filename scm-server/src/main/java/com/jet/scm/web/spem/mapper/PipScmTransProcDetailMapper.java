package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransProcDetail;
import com.jet.scm.web.spem.domain.PipScmTransProcDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransProcDetailMapper {
    int countByExample(PipScmTransProcDetailExample example);

    int deleteByExample(PipScmTransProcDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(PipScmTransProcDetail record);

    int insertSelective(PipScmTransProcDetail record);

    List<PipScmTransProcDetail> selectByExample(PipScmTransProcDetailExample example);

    PipScmTransProcDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcDetail record, @Param("example") PipScmTransProcDetailExample example);

    int updateByExample(@Param("record") PipScmTransProcDetail record, @Param("example") PipScmTransProcDetailExample example);

    int updateByPrimaryKeySelective(PipScmTransProcDetail record);

    int updateByPrimaryKey(PipScmTransProcDetail record);
}