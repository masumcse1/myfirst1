package com.step1;

import com.step1.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerService {

    @Autowired
      private CustomerRepo customerRepo;

    List<Customer> getCustomers() {

        return customerRepo.getCustomers();

    }


   public Customer getCustomersByID(long id) {

        return customerRepo.getCustomers()
                .stream()
                .filter(customer -> customer.getId()==id)
                .findFirst()
                .orElseThrow(()-> new NotFoundException("customer not found"+id));

    }


}
