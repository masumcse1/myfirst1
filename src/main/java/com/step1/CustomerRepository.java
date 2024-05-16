package com.step1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class CustomerRepository implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {


        List<Customer> list = new ArrayList<>();
        Customer xx = new Customer(2323, "masum","abc");
        Customer xx1 = new Customer(2325, "masums","abc");
        Customer yy = new Customer(2324, "masumdd","abc");
        list.add(xx);
        list.add(xx1);
        list.add(yy);

        return list;
    }



}
