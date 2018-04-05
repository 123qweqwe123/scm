package com.jet.datasync.bdcor2.mapper;

import com.jet.datasync.bdcor2.config.UseDatasourceBdcor2;
import com.jet.datasync.bdcor2.domain.PipScmFrozenbox2;
import com.jet.datasync.bdcor2.domain.PipScmFrozenbox2Example;
import com.jet.datasync.bdcor2.domain.PipScmFrozenbox2Key;
import java.util.List;

@UseDatasourceBdcor2
public interface PipScmFrozenbox2Mapper {
    int countByExample(PipScmFrozenbox2Example example);

    List<PipScmFrozenbox2> selectByExample(PipScmFrozenbox2Example example);

    PipScmFrozenbox2 selectByPrimaryKey(PipScmFrozenbox2Key key);
}