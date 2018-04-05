package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmFrozentube;
import com.jet.scm.web.spem.domain.PipScmFrozentubeExample;
import com.jet.scm.web.spem.domain.PipScmFrozentubeKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PipScmFrozentubeMapper {
    int countByExample(PipScmFrozentubeExample example);

    int deleteByExample(PipScmFrozentubeExample example);

    int deleteByPrimaryKey(PipScmFrozentubeKey key);

    int insert(PipScmFrozentube record);

    int insertSelective(PipScmFrozentube record);

    List<PipScmFrozentube> selectByExample(PipScmFrozentubeExample example);

    PipScmFrozentube selectByPrimaryKey(PipScmFrozentubeKey key);

    int updateByExampleSelective(@Param("record") PipScmFrozentube record, @Param("example") PipScmFrozentubeExample example);

    int updateByExample(@Param("record") PipScmFrozentube record, @Param("example") PipScmFrozentubeExample example);

    int updateByPrimaryKeySelective(PipScmFrozentube record);

    int updateByPrimaryKey(PipScmFrozentube record);
}