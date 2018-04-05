package com.jet.scm.mobile.web.spem.controller;

import com.jet.scm.mobile.web.spem.filter.TransferDetailFilter;
import com.jet.scm.mobile.web.spem.service.SpemTransferService;
import com.jet.scm.mobile.web.spem.vo.TransferDetailVO;
import com.jet.scm.mobile.web.spem.vo.TransferVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/31 下午2:45
 */
@RestController
@RequestMapping("/transfer")
public class SpemTransferController {

    @Autowired
    private SpemTransferService spemTransferService;

    /**
     * 在途运单(status=0)、查看运单
     *
     * @param filter
     * @return
     */
    @GetMapping("/details")
    public List<TransferVO> details(TransferDetailFilter filter) {
        return spemTransferService.selectDetails(filter);
    }

    @GetMapping("/details/{transDetailNo}")
    public TransferDetailVO detail(@PathVariable String transDetailNo) {
        return spemTransferService.selectDetail(transDetailNo);
    }

    @PostMapping("/details/{transDetailNo}")
    public Map<String, Object> saveDetail(@PathVariable String transDetailNo, TransferDetailVO transferDetailVO) {
        return spemTransferService.saveDetail(transDetailNo, transferDetailVO);
    }

}
