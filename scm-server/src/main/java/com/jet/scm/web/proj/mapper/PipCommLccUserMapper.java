package com.jet.scm.web.proj.mapper;

import com.jet.scm.web.proj.domain.PipCommLccUser;
import com.jet.scm.web.proj.domain.PipCommLccUserExample;
import com.jet.scm.web.proj.domain.PipCommLccUserKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipCommLccUserMapper {
    int countByExample(PipCommLccUserExample example);

    int deleteByExample(PipCommLccUserExample example);

    int deleteByPrimaryKey(PipCommLccUserKey key);

    int insert(PipCommLccUser record);

    int insertSelective(PipCommLccUser record);

    List<PipCommLccUser> selectByExample(PipCommLccUserExample example);

    PipCommLccUser selectByPrimaryKey(PipCommLccUserKey key);

    int updateByExampleSelective(@Param("record") PipCommLccUser record, @Param("example") PipCommLccUserExample example);

    int updateByExample(@Param("record") PipCommLccUser record, @Param("example") PipCommLccUserExample example);

    int updateByPrimaryKeySelective(PipCommLccUser record);

    int updateByPrimaryKey(PipCommLccUser record);
}