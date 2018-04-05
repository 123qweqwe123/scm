package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmFrozenbox;
import com.jet.scm.web.spem.domain.PipScmFrozenboxExample;
import com.jet.scm.web.spem.domain.PipScmFrozenboxKey;
import com.jet.scm.web.spem.vo.ScmBox4MasterVO;
import com.jet.scm.web.spem.vo.ScmBoxVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmFrozenboxMapper {
    long countByExample(PipScmFrozenboxExample example);

    int deleteByExample(PipScmFrozenboxExample example);

    int deleteByPrimaryKey(PipScmFrozenboxKey key);

    int insert(PipScmFrozenbox record);

    int insertSelective(PipScmFrozenbox record);

    List<PipScmFrozenbox> selectByExample(PipScmFrozenboxExample example);

    PipScmFrozenbox selectByPrimaryKey(PipScmFrozenboxKey key);

    int updateByExampleSelective(@Param("record") PipScmFrozenbox record, @Param("example") PipScmFrozenboxExample example);

    int updateByExample(@Param("record") PipScmFrozenbox record, @Param("example") PipScmFrozenboxExample example);

    int updateByPrimaryKeySelective(PipScmFrozenbox record);

    int updateByPrimaryKey(PipScmFrozenbox record);

    List<ScmBoxVO> queryBoxByLccCode(@Param("lccCode") String lccCode);

    List<ScmBox4MasterVO> queryBoxByRccCode(@Param("rccCode") String rccCode);

    ScmBox4MasterVO getFrozenboxByBoxCode(@Param("boxCode") String boxCode);
}