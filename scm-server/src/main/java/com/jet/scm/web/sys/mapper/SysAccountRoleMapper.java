package com.jet.scm.web.sys.mapper;

import com.jet.scm.web.sys.domain.SysAccountRoleExample;
import com.jet.scm.web.sys.domain.SysAccountRoleKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysAccountRoleMapper {
    int countByExample(SysAccountRoleExample example);

    int deleteByExample(SysAccountRoleExample example);

    int deleteByPrimaryKey(SysAccountRoleKey key);

    int insert(SysAccountRoleKey record);

    int insertSelective(SysAccountRoleKey record);

    List<SysAccountRoleKey> selectByExample(SysAccountRoleExample example);

    int updateByExampleSelective(@Param("record") SysAccountRoleKey record, @Param("example") SysAccountRoleExample example);

    int updateByExample(@Param("record") SysAccountRoleKey record, @Param("example") SysAccountRoleExample example);
}