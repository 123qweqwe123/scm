package com.jet.scm.web.sys.mapper;

import com.jet.scm.web.sys.domain.SysDataSync;
import com.jet.scm.web.sys.domain.SysDataSyncExample;
import java.util.List;

import com.jet.scm.web.sys.filter.DataSyncFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDataSyncMapper {
    long countByExample(SysDataSyncExample example);

    int deleteByExample(SysDataSyncExample example);

    int insert(SysDataSync record);

    int insertSelective(SysDataSync record);

    List<SysDataSync> selectByExample(SysDataSyncExample example);

    int updateByExampleSelective(@Param("record") SysDataSync record, @Param("example") SysDataSyncExample example);

    int updateByExample(@Param("record") SysDataSync record, @Param("example") SysDataSyncExample example);

    List<SysDataSync> selectByFilter(DataSyncFilter filter);
}