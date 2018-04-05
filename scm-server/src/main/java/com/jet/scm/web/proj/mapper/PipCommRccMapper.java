package com.jet.scm.web.proj.mapper;

import com.jet.scm.web.proj.qo.RccQO;
import com.jet.scm.web.proj.domain.PipCommRcc;
import com.jet.scm.web.proj.domain.PipCommRccExample;
import com.jet.scm.web.proj.domain.PipCommRccKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipCommRccMapper {
    int countByExample(PipCommRccExample example);

    int deleteByExample(PipCommRccExample example);

    int deleteByPrimaryKey(PipCommRccKey key);

    int insert(PipCommRcc record);

    int insertSelective(PipCommRcc record);

    List<PipCommRcc> selectByExample(PipCommRccExample example);

    PipCommRcc selectByPrimaryKey(PipCommRccKey key);

    int updateByExampleSelective(@Param("record") PipCommRcc record, @Param("example") PipCommRccExample example);

    int updateByExample(@Param("record") PipCommRcc record, @Param("example") PipCommRccExample example);

    int updateByPrimaryKeySelective(PipCommRcc record);

    int updateByPrimaryKey(PipCommRcc record);

    List<PipCommRcc> selectRccWithPermission(RccQO qo);
}