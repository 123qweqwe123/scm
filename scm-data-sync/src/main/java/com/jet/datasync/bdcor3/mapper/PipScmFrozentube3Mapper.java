package com.jet.datasync.bdcor3.mapper;

import com.jet.datasync.bdcor3.config.UseDatasourceBdcor3;
import com.jet.datasync.bdcor3.domain.PipScmFrozentube3;
import com.jet.datasync.bdcor3.domain.PipScmFrozentube3Example;
import com.jet.datasync.bdcor3.domain.PipScmFrozentube3Key;

import java.util.List;

@UseDatasourceBdcor3
public interface PipScmFrozentube3Mapper {
    int countByExample(PipScmFrozentube3Example example);

    List<PipScmFrozentube3> selectByExample(PipScmFrozentube3Example example);

    PipScmFrozentube3 selectByPrimaryKey(PipScmFrozentube3Key key);
}