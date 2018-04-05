package com.jet.datasync.samples.repository;

import com.jet.datasync.samples.proto.CustomerProtos;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/10 下午7:55
 */
public interface CustomerRepository {

    CustomerProtos.Customer findById(int id);
}
