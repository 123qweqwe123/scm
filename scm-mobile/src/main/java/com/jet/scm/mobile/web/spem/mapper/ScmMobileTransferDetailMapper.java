package com.jet.scm.mobile.web.spem.mapper;

import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetail;
import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScmMobileTransferDetailMapper {
    long countByExample(ScmMobileTransferDetailExample example);

    int deleteByExample(ScmMobileTransferDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(ScmMobileTransferDetail record);

    int insertSelective(ScmMobileTransferDetail record);

    List<ScmMobileTransferDetail> selectByExample(ScmMobileTransferDetailExample example);

    ScmMobileTransferDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ScmMobileTransferDetail record, @Param("example") ScmMobileTransferDetailExample example);

    int updateByExample(@Param("record") ScmMobileTransferDetail record, @Param("example") ScmMobileTransferDetailExample example);

    int updateByPrimaryKeySelective(ScmMobileTransferDetail record);

    int updateByPrimaryKey(ScmMobileTransferDetail record);
}