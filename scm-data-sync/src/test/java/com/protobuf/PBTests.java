package com.protobuf;

import com.example.tutorial.AddressBookProtos;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/10 下午2:42
 */
public class PBTests {


    @Test
    public void testCreate() throws InvalidProtocolBufferException {
        AddressBookProtos.Person john =
                AddressBookProtos.Person.newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                AddressBookProtos.Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(AddressBookProtos.Person.PhoneType.HOME))
                        .build();
        byte[] johnBytes = john.toByteArray();
        AddressBookProtos.Person person = AddressBookProtos.Person.parseFrom(johnBytes);
        Assert.assertEquals(1234, person.getId());
    }
}
