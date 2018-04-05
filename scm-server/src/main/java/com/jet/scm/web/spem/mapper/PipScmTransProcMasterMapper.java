package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransProcMaster;
import com.jet.scm.web.spem.domain.PipScmTransProcMasterExample;
import com.jet.scm.web.spem.filter.SpemTransferFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PipScmTransProcMasterMapper {
    int countByExample(PipScmTransProcMasterExample example);

    int deleteByExample(PipScmTransProcMasterExample example);

    int deleteByPrimaryKey(String id);

    int insert(PipScmTransProcMaster record);

    int insertSelective(PipScmTransProcMaster record);

    List<PipScmTransProcMaster> selectByExample(PipScmTransProcMasterExample example);

    PipScmTransProcMaster selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcMaster record, @Param("example") PipScmTransProcMasterExample example);

    int updateByExample(@Param("record") PipScmTransProcMaster record, @Param("example") PipScmTransProcMasterExample example);

    int updateByPrimaryKeySelective(PipScmTransProcMaster record);

    int updateByPrimaryKey(PipScmTransProcMaster record);

    List<?> selectByFilter(SpemTransferFilter filter);

    List<Map<String, Object>> selectNoTransData(SpemTransferFilter filter);
}