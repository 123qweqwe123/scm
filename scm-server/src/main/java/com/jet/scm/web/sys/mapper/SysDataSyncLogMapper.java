package com.jet.scm.web.sys.mapper;

import com.jet.scm.web.spem.filter.SpemTransferFilter;
import com.jet.scm.web.sys.domain.SysDataSyncLog;
import com.jet.scm.web.sys.domain.SysDataSyncLogExample;
import com.jet.scm.web.sys.filter.DataSyncLogFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysDataSyncLogMapper {
    long countByExample(SysDataSyncLogExample example);

    int deleteByExample(SysDataSyncLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDataSyncLog record);

    int insertSelective(SysDataSyncLog record);

    List<SysDataSyncLog> selectByExample(SysDataSyncLogExample example);

    SysDataSyncLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDataSyncLog record, @Param("example") SysDataSyncLogExample example);

    int updateByExample(@Param("record") SysDataSyncLog record, @Param("example") SysDataSyncLogExample example);

    int updateByPrimaryKeySelective(SysDataSyncLog record);

    int updateByPrimaryKey(SysDataSyncLog record);

    List<Map<String, Object>> selectByFilter(DataSyncLogFilter filter);
}