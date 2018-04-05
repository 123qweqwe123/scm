package com.jet.scm.web.proj.service.impl;

import com.jet.scm.web.proj.domain.PipCommRcc;
import com.jet.scm.web.proj.mapper.PipCommRccMapper;
import com.jet.scm.web.proj.qo.RccQO;
import com.jet.scm.web.proj.service.RccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/30 上午10:11
 */
@Service
public class RccServiceImpl implements RccService {

    @Autowired
    private PipCommRccMapper pipCommRccMapper;


    @Override
    public List<PipCommRcc> queryRccs() {
        RccQO qo = new RccQO();
//        if (!Securitys.isAdmin()) {
//            qo.setUserId(String.valueOf(Securitys.getAccountId()));
//        }
        return pipCommRccMapper.selectRccWithPermission(qo);
    }
}
