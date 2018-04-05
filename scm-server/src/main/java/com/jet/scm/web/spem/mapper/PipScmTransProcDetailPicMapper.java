package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmTransProcDetailPic;
import com.jet.scm.web.spem.domain.PipScmTransProcDetailPicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransProcDetailPicMapper {
    int countByExample(PipScmTransProcDetailPicExample example);

    int deleteByExample(PipScmTransProcDetailPicExample example);

    int deleteByPrimaryKey(String id);

    int insert(PipScmTransProcDetailPic record);

    int insertSelective(PipScmTransProcDetailPic record);

    List<PipScmTransProcDetailPic> selectByExample(PipScmTransProcDetailPicExample example);

    PipScmTransProcDetailPic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcDetailPic record, @Param("example") PipScmTransProcDetailPicExample example);

    int updateByExample(@Param("record") PipScmTransProcDetailPic record, @Param("example") PipScmTransProcDetailPicExample example);

    int updateByPrimaryKeySelective(PipScmTransProcDetailPic record);

    int updateByPrimaryKey(PipScmTransProcDetailPic record);
}