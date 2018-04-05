package com.jet.scm.web.common.mapper;

import com.jet.scm.web.common.domain.SysParameter;
import com.jet.scm.web.common.domain.SysParameterExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysParameterMapper {
    int countByExample(SysParameterExample example);

    int deleteByExample(SysParameterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysParameter record);

    int insertSelective(SysParameter record);

    List<SysParameter> selectByExample(SysParameterExample example);

    SysParameter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysParameter record, @Param("example") SysParameterExample example);

    int updateByExample(@Param("record") SysParameter record, @Param("example") SysParameterExample example);

    int updateByPrimaryKeySelective(SysParameter record);

    int updateByPrimaryKey(SysParameter record);
}