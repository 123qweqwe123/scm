package com.jet.scm.mobile.web.spem.mapper;

import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetailPic;
import com.jet.scm.mobile.web.spem.domain.ScmMobileTransferDetailPicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScmMobileTransferDetailPicMapper {
    long countByExample(ScmMobileTransferDetailPicExample example);

    int deleteByExample(ScmMobileTransferDetailPicExample example);

    int deleteByPrimaryKey(String id);

    int insert(ScmMobileTransferDetailPic record);

    int insertSelective(ScmMobileTransferDetailPic record);

    List<ScmMobileTransferDetailPic> selectByExample(ScmMobileTransferDetailPicExample example);

    ScmMobileTransferDetailPic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ScmMobileTransferDetailPic record, @Param("example") ScmMobileTransferDetailPicExample example);

    int updateByExample(@Param("record") ScmMobileTransferDetailPic record, @Param("example") ScmMobileTransferDetailPicExample example);

    int updateByPrimaryKeySelective(ScmMobileTransferDetailPic record);

    int updateByPrimaryKey(ScmMobileTransferDetailPic record);
}