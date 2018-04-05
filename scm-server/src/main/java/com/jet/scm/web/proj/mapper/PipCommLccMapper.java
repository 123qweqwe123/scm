package com.jet.scm.web.proj.mapper;

import com.jet.scm.web.proj.domain.PipCommLcc;
import com.jet.scm.web.proj.domain.PipCommLccExample;
import com.jet.scm.web.proj.domain.PipCommLccKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipCommLccMapper {
    int countByExample(PipCommLccExample example);

    int deleteByExample(PipCommLccExample example);

    int deleteByPrimaryKey(PipCommLccKey key);

    int insert(PipCommLcc record);

    int insertSelective(PipCommLcc record);

    List<PipCommLcc> selectByExample(PipCommLccExample example);

    PipCommLcc selectByPrimaryKey(PipCommLccKey key);

    int updateByExampleSelective(@Param("record") PipCommLcc record, @Param("example") PipCommLccExample example);

    int updateByExample(@Param("record") PipCommLcc record, @Param("example") PipCommLccExample example);

    int updateByPrimaryKeySelective(PipCommLcc record);

    int updateByPrimaryKey(PipCommLcc record);
}