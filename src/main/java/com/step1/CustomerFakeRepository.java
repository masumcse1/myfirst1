package com.step1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "fake")
public class CustomerFakeRepository implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(new Customer(120,"james","abc"));
    }
}
