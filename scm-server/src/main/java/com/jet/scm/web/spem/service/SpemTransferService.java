package com.jet.scm.web.spem.service;

import com.jet.scm.web.common.domain.PipScmTransLink;
import com.jet.scm.web.spem.domain.PipScmTransEmail;
import com.jet.scm.web.spem.domain.PipScmTransProcDetail;
import com.jet.scm.web.spem.domain.PipScmTransProcDetailPic;
import com.jet.scm.web.spem.filter.SpemTransferFilter;
import com.jet.scm.web.spem.qo.SpemTransferDetailUploadQO;
import com.jet.scm.web.spem.qo.TransMasterQO;
import com.jet.scm.web.spem.vo.ScmBox4MasterVO;
import com.jet.scm.web.spem.vo.ScmBoxVO;
import com.jet.scm.web.spem.vo.TransNoVO;

import java.util.List;

public interface SpemTransferService {

    /**
     * 样本转运单列表
     *
     * @param filter
     * @return
     */
    List<?> transfers(SpemTransferFilter filter);


    /**
     * 获取转运单明细
     *
     * @param transferId
     * @param filter
     * @return
     */
    List<?> transferDetails(String transferId, SpemTransferFilter filter);

    /**
     * 未转运列表
     *
     * @param filter
     * @return
     */
    List<?> unTransfers(SpemTransferFilter filter);

    List<?> linkMans(String lccCode, Short type);

    void updateTransferDetails(String transferId, PipScmTransProcDetail detail);

    List<PipScmTransLink> createOrUpdatelinkMan(String transferId, String detailId, PipScmTransLink link);

    void validateLinkName(String q, Short type, String lccCode);

    void uploadTransferDetailAttachment(String transferId, String detailId, SpemTransferDetailUploadQO qo);

    List<PipScmTransProcDetailPic> images(String transferId, String detailId);

    List<ScmBoxVO> unselectedBoxes(String lccCode);

    void appendTransferDetail(String transferId, String detailId, String boxes);

    List<PipScmTransEmail> emails(Short type);

    void createEmails(PipScmTransEmail email);

    void updateEmails(PipScmTransEmail email);

    TransNoVO createTransNo(String rccCodeAndDateStr);

    void validateEmail(String q, Short type);

    List<ScmBox4MasterVO> boxes(String rccCode);

    void createTransfers(TransMasterQO qo);

    List<?> boxesByTransId(String transId);

    void deliverTransfers(String transId);
}
