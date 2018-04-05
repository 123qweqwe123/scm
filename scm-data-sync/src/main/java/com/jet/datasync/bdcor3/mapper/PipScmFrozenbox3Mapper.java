package com.jet.datasync.bdcor3.mapper;

import com.jet.datasync.bdcor3.config.UseDatasourceBdcor3;
import com.jet.datasync.bdcor3.domain.PipScmFrozenbox3;
import com.jet.datasync.bdcor3.domain.PipScmFrozenbox3Example;
import com.jet.datasync.bdcor3.domain.PipScmFrozenbox3Key;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@UseDatasourceBdcor3
public interface PipScmFrozenbox3Mapper {
    int countByExample(PipScmFrozenbox3Example example);

    List<PipScmFrozenbox3> selectByExample(PipScmFrozenbox3Example example);

    PipScmFrozenbox3 selectByPrimaryKey(PipScmFrozenbox3Key key);

    int updateByExampleSelective(@Param("record") PipScmFrozenbox3 record, @Param("example") PipScmFrozenbox3Example example);

    int updateByExample(@Param("record") PipScmFrozenbox3 record, @Param("example") PipScmFrozenbox3Example example);
}