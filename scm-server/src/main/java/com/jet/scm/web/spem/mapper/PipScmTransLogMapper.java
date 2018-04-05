package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PipScmTransLogMapper {
    int insert(PipScmTransLog record);

    int insertSelective(PipScmTransLog record);
}