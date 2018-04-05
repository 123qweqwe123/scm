package com.jet.scm.web.spem.controller;

import com.jet.scm.web.common.domain.PipScmTransLink;
import com.jet.scm.web.spem.domain.PipScmTransEmail;
import com.jet.scm.web.spem.domain.PipScmTransProcDetail;
import com.jet.scm.web.spem.domain.PipScmTransProcDetailPic;
import com.jet.scm.web.spem.filter.SpemTransferFilter;
import com.jet.scm.web.spem.qo.SpemTransferDetailUploadQO;
import com.jet.scm.web.spem.qo.TransMasterQO;
import com.jet.scm.web.spem.service.SpemTransferService;
import com.jet.scm.web.spem.vo.ScmBox4MasterVO;
import com.jet.scm.web.spem.vo.ScmBoxVO;
import com.jet.scm.web.spem.vo.TransNoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 * <pre>
 *     样本转运指令
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/19 下午1:35
 */
@RestController
@RequestMapping("/spem")
public class SpemTransferController {

    @Autowired
    SpemTransferService transferService;

    @GetMapping("/transfers")
    public List<?> transfers(SpemTransferFilter filter) {
        return transferService.transfers(filter);
    }

    @PostMapping("/transfers")
    public void createTransfers(TransMasterQO qo) {
        transferService.createTransfers(qo);
    }

    @GetMapping("/unTransfers")
    public List<?> unTransfers(SpemTransferFilter filter) {
        return transferService.unTransfers(filter);
    }

    /**
     * 运单交付
     *
     * @param transId
     */
    @PatchMapping("/transfers/deliver")
    public void deliverTransfers(String transId) {
        transferService.deliverTransfers(transId);
    }

    @GetMapping("/transfers/{transId}/details")
    public List<?> transferDetails(@PathVariable("transId") String transferId, SpemTransferFilter filter) {
        return transferService.transferDetails(transferId, filter);
    }

    /**
     * 取样人
     *
     * @param transferId
     * @return
     */
    @GetMapping("/transfers/{transId}/details/linkMans")
    public List<?> linkMans(@PathVariable("transId") String transferId, String lccCode, Short type) {
        return transferService.linkMans(lccCode, type);
    }

    /**
     * 修改运单明细
     *
     * @param transferId
     * @param detail
     */
    @PutMapping("/transfers/{transId}/details")
    public void updateTransferDetails(@PathVariable("transId") String transferId, PipScmTransProcDetail detail) {
        transferService.updateTransferDetails(transferId, detail);
    }


    /**
     * 如果新增
     *
     * @param transferId
     * @param link
     * @return
     */
    @PostMapping("/transfers/{transId}/details/{detailId}/linkMans")
    public List<PipScmTransLink> createOrUpdatelinkMan(@PathVariable("transId") String transferId,
                                                       @PathVariable("detailId") String detailId,
                                                       PipScmTransLink link) {
        return transferService.createOrUpdatelinkMan(transferId, detailId, link);
    }

    /**
     * 添加/修改联系人校验是否已存在
     *
     * @param q
     * @param type
     * @param lccCode
     */
    @GetMapping("/transfers/linkNameValidation")
    public void validateLinkName(String q,
                                 Short type,
                                 String lccCode) {
        transferService.validateLinkName(q, type, lccCode);
    }

    /**
     * 运单补录
     *
     * @param transferId
     * @param detailId
     * @param boxes
     */
    @PostMapping("/transfers/{transId}/details/{detailId}")
    public void appendTransferDetail(@PathVariable("transId") String transferId,
                                     @PathVariable("detailId") String detailId,
                                     @RequestParam String boxes) {
        transferService.appendTransferDetail(transferId, detailId, boxes);
    }


    /**
     * 上传运单
     *
     * @param qo
     */
    @PostMapping("/transfers/{transId}/details/{detailId}/upload")
    public void uploadTransferDetailAttachment(@PathVariable("transId") String transferId,
                                               @PathVariable("detailId") String detailId,
                                               SpemTransferDetailUploadQO qo) {
        transferService.uploadTransferDetailAttachment(transferId, detailId, qo);
    }

    /**
     * 获取运单明细对应的附件列表
     *
     * @param transferId
     * @param detailId
     * @return
     */
    @GetMapping("/transfers/{transId}/details/{detailId}/images")
    public List<PipScmTransProcDetailPic> images(@PathVariable("transId") String transferId,
                                                 @PathVariable("detailId") String detailId) {
        return transferService.images(transferId, detailId);
    }


    /**
     * 获取未被选中的冻存盒
     *
     * @param lccCode
     * @return
     */
    @GetMapping("/unselectedBoxes")
    public List<ScmBoxVO> unselectedBoxes(String lccCode) {
        return transferService.unselectedBoxes(lccCode);
    }


    @GetMapping("/emails")
    public List<PipScmTransEmail> emails(Short type) {
        return transferService.emails(type);
    }

    @PostMapping("/emails")
    public void createEmails(PipScmTransEmail email) {
        transferService.createEmails(email);
    }

    @PatchMapping("/emails")
    public void updateEmails(PipScmTransEmail email) {
        transferService.updateEmails(email);
    }

    @GetMapping("/transfers/queryTransNo")
    public TransNoVO createTransNo(String rccCodeAndDateStr) {
        return transferService.createTransNo(rccCodeAndDateStr);

    }

    @GetMapping("/transfers/emailValidation")
    public void validateEmail(String q,
                              Short type) {
        transferService.validateEmail(q, type);
    }

    @GetMapping("/transfers/boxes")
    public List<ScmBox4MasterVO> boxes(String rccCode) {
        return transferService.boxes(rccCode);
    }

    @GetMapping("/transfers/{transId}/boxes")
    public List<?> boxesByTransId(@PathVariable("transId") String transId) {
        return transferService.boxesByTransId(transId);
    }


}
