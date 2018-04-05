package com.jet.datasync.bdcor3.mapper;

import com.jet.datasync.bdcor3.config.UseDatasourceBdcor3;
import com.jet.datasync.bdcor3.domain.PipCommLcc3;
import com.jet.datasync.bdcor3.domain.PipCommLcc3Example;
import com.jet.datasync.bdcor3.domain.PipCommLcc3Key;
import java.util.List;

@UseDatasourceBdcor3
public interface PipCommLcc3Mapper {
    int countByExample(PipCommLcc3Example example);

    List<PipCommLcc3> selectByExample(PipCommLcc3Example example);

    PipCommLcc3 selectByPrimaryKey(PipCommLcc3Key key);
}