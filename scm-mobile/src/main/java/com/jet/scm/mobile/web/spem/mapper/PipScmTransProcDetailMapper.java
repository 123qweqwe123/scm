package com.jet.scm.mobile.web.spem.mapper;

import com.jet.scm.mobile.web.spem.domain.PipScmTransProcDetail;
import com.jet.scm.mobile.web.spem.domain.PipScmTransProcDetailExample;
import com.jet.scm.mobile.web.spem.filter.TransferDetailFilter;
import com.jet.scm.mobile.web.spem.vo.TransferVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PipScmTransProcDetailMapper {
    long countByExample(PipScmTransProcDetailExample example);

    List<PipScmTransProcDetail> selectByExample(PipScmTransProcDetailExample example);

    PipScmTransProcDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PipScmTransProcDetail record, @Param("example") PipScmTransProcDetailExample example);

    int updateByExample(@Param("record") PipScmTransProcDetail record, @Param("example") PipScmTransProcDetailExample example);

    int updateByPrimaryKeySelective(PipScmTransProcDetail record);

    int updateByPrimaryKey(PipScmTransProcDetail record);

    List<TransferVO> selectByFilter(TransferDetailFilter filter);
}