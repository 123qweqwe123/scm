package com.jet.scm.web.spem.mapper;

import com.jet.scm.web.spem.domain.PipScmFrozenboxTransport;
import com.jet.scm.web.spem.domain.PipScmFrozenboxTransportExample;
import com.jet.scm.web.spem.vo.ReceiveInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PipScmFrozenboxTransportMapper {
    long countByExample(PipScmFrozenboxTransportExample example);

    int insert(PipScmFrozenboxTransport record);

    int insertSelective(PipScmFrozenboxTransport record);

    List<PipScmFrozenboxTransport> selectByExample(PipScmFrozenboxTransportExample example);

    int updateByExampleSelective(@Param("record") PipScmFrozenboxTransport record, @Param("example") PipScmFrozenboxTransportExample example);

    int updateByExample(@Param("record") PipScmFrozenboxTransport record, @Param("example") PipScmFrozenboxTransportExample example);

    List<ReceiveInfoVO> getReceiveInfo(@Param("detailId") String detailId);

    void insertBox(Map<String, Object> boxMap);

    void updateBox(Map<String, Object> boxMap);
}