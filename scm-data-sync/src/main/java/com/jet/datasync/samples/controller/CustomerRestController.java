package com.jet.datasync.samples.controller;

import com.jet.datasync.samples.proto.CustomerProtos;
import com.jet.datasync.samples.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/10 下午7:45
 */
@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/customers/{id}", produces = "application/x-protobuf")
    CustomerProtos.Customer customer(@PathVariable Integer id) {
        return this.customerRepository.findById(id);
    }

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }
}
