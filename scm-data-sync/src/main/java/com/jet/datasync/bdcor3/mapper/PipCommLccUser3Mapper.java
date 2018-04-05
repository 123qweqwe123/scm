package com.jet.datasync.bdcor3.mapper;

import com.jet.datasync.bdcor3.config.UseDatasourceBdcor3;
import com.jet.datasync.bdcor3.domain.PipCommLccUser3;
import com.jet.datasync.bdcor3.domain.PipCommLccUser3Example;
import com.jet.datasync.bdcor3.domain.PipCommLccUser3Key;
import java.util.List;

@UseDatasourceBdcor3
public interface PipCommLccUser3Mapper {
    int countByExample(PipCommLccUser3Example example);

    List<PipCommLccUser3> selectByExample(PipCommLccUser3Example example);

    PipCommLccUser3 selectByPrimaryKey(PipCommLccUser3Key key);
}