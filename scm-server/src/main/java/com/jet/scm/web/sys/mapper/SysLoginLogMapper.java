package com.jet.scm.web.sys.mapper;

import com.jet.scm.web.sys.domain.SysLoginLog;
import com.jet.scm.web.sys.domain.SysLoginLogExample;
import com.jet.scm.web.sys.filter.LoginLogFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysLoginLogMapper {
    int countByExample(SysLoginLogExample example);

    int deleteByExample(SysLoginLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    SysLoginLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);

    List<SysLoginLog> selectByFilter(LoginLogFilter filter);
}