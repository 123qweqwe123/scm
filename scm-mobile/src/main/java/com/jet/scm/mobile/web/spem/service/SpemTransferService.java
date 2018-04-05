package com.jet.scm.mobile.web.spem.service;

import com.jet.scm.mobile.web.spem.filter.TransferDetailFilter;
import com.jet.scm.mobile.web.spem.vo.TransferDetailVO;
import com.jet.scm.mobile.web.spem.vo.TransferVO;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 上午10:06
 */
public interface SpemTransferService {

    List<TransferVO> selectDetails(TransferDetailFilter filter);

    TransferDetailVO selectDetail(String transDetailNo);

    Map<String, Object> saveDetail(String transDetailNo, TransferDetailVO transferDetailVO);
}
