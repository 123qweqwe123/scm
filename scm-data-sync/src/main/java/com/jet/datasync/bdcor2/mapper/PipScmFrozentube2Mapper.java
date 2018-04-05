package com.jet.datasync.bdcor2.mapper;

import com.jet.datasync.bdcor2.config.UseDatasourceBdcor2;
import com.jet.datasync.bdcor2.domain.PipScmFrozentube2;
import com.jet.datasync.bdcor2.domain.PipScmFrozentube2Example;
import com.jet.datasync.bdcor2.domain.PipScmFrozentube2Key;
import com.jet.datasync.bdcor2.filter.PipScmFrozentube2Filter;

import java.util.List;

@UseDatasourceBdcor2
public interface PipScmFrozentube2Mapper {
    int countByExample(PipScmFrozentube2Example example);

    List<PipScmFrozentube2> selectByExample(PipScmFrozentube2Example example);

    PipScmFrozentube2 selectByPrimaryKey(PipScmFrozentube2Key key);

    List<PipScmFrozentube2> selectByRownum(PipScmFrozentube2Filter filter);

}