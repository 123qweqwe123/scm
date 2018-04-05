package com.jet.scm.web.sys.mapper;

import com.jet.scm.web.sys.domain.SysAccount;
import com.jet.scm.web.sys.domain.SysAccountExample;
import com.jet.scm.web.sys.filter.AccountFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysAccountMapper {
    int countByExample(SysAccountExample example);

    int deleteByExample(SysAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    List<SysAccount> selectByExample(SysAccountExample example);

    SysAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAccount record, @Param("example") SysAccountExample example);

    int updateByExample(@Param("record") SysAccount record, @Param("example") SysAccountExample example);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);

    List<SysAccount> selectByFilter(AccountFilter filter);
}