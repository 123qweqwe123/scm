package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransProcMasterMail;
import com.jet.scm.web.spem.domain.PipScmTransProcMasterMailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransProcMasterMailMapper {
    int insert(PipScmTransProcMasterMail record);

    int insertSelective(PipScmTransProcMasterMail record);

    List<PipScmTransProcMasterMail> selectByExample(PipScmTransProcMasterMailExample example);

    PipScmTransProcMasterMail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcMasterMail record, @Param("example") PipScmTransProcMasterMailExample example);

    int updateByExample(@Param("record") PipScmTransProcMasterMail record, @Param("example") PipScmTransProcMasterMailExample example);

    int updateByPrimaryKeySelective(PipScmTransProcMasterMail record);

    int updateByPrimaryKey(PipScmTransProcMasterMail record);
}