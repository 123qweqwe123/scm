package com.jet.datasync.samples.config;

import com.jet.datasync.samples.proto.CustomerProtos;
import com.jet.datasync.samples.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/10 下午7:53
 */
@Configuration
public class SamplesConfig {

    @Bean
    CustomerRepository customerRepository() {
        Map<Integer, CustomerProtos.Customer> customers = new ConcurrentHashMap<>();
        // populate with some dummy data
        Arrays.asList(
                customer(1, "Chris", "Richardson", Arrays.asList("crichardson@email.com")),
                customer(2, "Josh", "Long", Arrays.asList("jlong@email.com")),
                customer(3, "Matt", "Stine", Arrays.asList("mstine@email.com")),
                customer(4, "Russ", "Miles", Arrays.asList("rmiles@email.com"))
        ).forEach(c -> customers.put(c.getId(), c));

        // our lambda just gets forwarded to Map#get(Integer)
        return customers::get;
    }

    private CustomerProtos.Customer customer(int id, String f, String l, Collection<String> emails) {
        Collection<CustomerProtos.Customer.EmailAddress> emailAddresses =
                emails.stream().map(e -> CustomerProtos.Customer.EmailAddress.newBuilder()
                        .setType(CustomerProtos.Customer.EmailType.PROFESSIONAL)
                        .setEmail(e).build())
                        .collect(Collectors.toList());

        return CustomerProtos.Customer.newBuilder()
                .setFirstName(f)
                .setLastName(l)
                .setId(id)
                .addAllEmail(emailAddresses)
                .build();
    }

}

