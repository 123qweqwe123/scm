package com.jet.scm.mobile.web.spem.mapper;

import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetailBox;
import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetailBoxExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScmMobileTransferDetailBoxMapper {
    long countByExample(ScmMobileTransferDetailBoxExample example);

    int deleteByExample(ScmMobileTransferDetailBoxExample example);

    int deleteByPrimaryKey(String id);

    int insert(ScmMobileTransferDetailBox record);

    int insertSelective(ScmMobileTransferDetailBox record);

    List<ScmMobileTransferDetailBox> selectByExample(ScmMobileTransferDetailBoxExample example);

    ScmMobileTransferDetailBox selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ScmMobileTransferDetailBox record, @Param("example") ScmMobileTransferDetailBoxExample example);

    int updateByExample(@Param("record") ScmMobileTransferDetailBox record, @Param("example") ScmMobileTransferDetailBoxExample example);

    int updateByPrimaryKeySelective(ScmMobileTransferDetailBox record);

    int updateByPrimaryKey(ScmMobileTransferDetailBox record);
}