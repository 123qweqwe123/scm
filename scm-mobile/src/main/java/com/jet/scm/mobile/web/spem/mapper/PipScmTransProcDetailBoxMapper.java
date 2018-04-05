package com.jet.scm.mobile.web.spem.mapper;

import com.jet.scm.mobile.web.spem.domain.PipScmTransProcDetailBox;
import com.jet.scm.mobile.web.spem.domain.PipScmTransProcDetailBoxExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PipScmTransProcDetailBoxMapper {
    long countByExample(PipScmTransProcDetailBoxExample example);

    List<PipScmTransProcDetailBox> selectByExample(PipScmTransProcDetailBoxExample example);

    PipScmTransProcDetailBox selectByPrimaryKey(String id);
}