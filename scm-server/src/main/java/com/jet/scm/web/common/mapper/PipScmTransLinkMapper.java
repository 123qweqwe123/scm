package com.jet.scm.web.common.mapper;

import com.jet.scm.web.common.domain.PipScmTransLink;
import com.jet.scm.web.common.domain.PipScmTransLinkExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransLinkMapper {
    int countByExample(PipScmTransLinkExample example);

    int deleteByExample(PipScmTransLinkExample example);

    int deleteByPrimaryKey(String id);

    int insert(PipScmTransLink record);

    int insertSelective(PipScmTransLink record);

    List<PipScmTransLink> selectByExample(PipScmTransLinkExample example);

    PipScmTransLink selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransLink record, @Param("example") PipScmTransLinkExample example);

    int updateByExample(@Param("record") PipScmTransLink record, @Param("example") PipScmTransLinkExample example);

    int updateByPrimaryKeySelective(PipScmTransLink record);

    int updateByPrimaryKey(PipScmTransLink record);
}