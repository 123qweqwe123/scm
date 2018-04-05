package com.jet.scm.mobile.web.sys.mapper;

import com.jet.scm.mobile.web.sys.domain.SysAccount;
import com.jet.scm.mobile.web.sys.domain.SysAccountExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysAccountMapper {
    long countByExample(SysAccountExample example);

    List<SysAccount> selectByExample(SysAccountExample example);

    SysAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAccount record, @Param("example") SysAccountExample example);

    int updateByExample(@Param("record") SysAccount record, @Param("example") SysAccountExample example);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);
}