package com.jet.datasync.bdcor3.mapper;

import com.jet.datasync.bdcor3.config.UseDatasourceBdcor3;
import com.jet.datasync.bdcor3.domain.PipCommRcc3;
import com.jet.datasync.bdcor3.domain.PipCommRcc3Example;
import com.jet.datasync.bdcor3.domain.PipCommRcc3Key;

import java.util.List;

@UseDatasourceBdcor3
public interface PipCommRcc3Mapper {
    int countByExample(PipCommRcc3Example example);

    List<PipCommRcc3> selectByExample(PipCommRcc3Example example);

    PipCommRcc3 selectByPrimaryKey(PipCommRcc3Key key);
}