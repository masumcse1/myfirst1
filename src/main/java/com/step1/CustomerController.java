package com.step1;

import com.step1.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {


    @Autowired
    private CustomerService  customerService;

    @GetMapping
    List<Customer> getCustomers(){

        return customerService.getCustomers();
    }
    @GetMapping(path = "{customerid}")
    Customer getCustomersByID(@PathVariable("customerid") long id){

        return customerService.getCustomersByID(id);
    }

    @GetMapping(path = "{customerid}/exception")
    Customer getCustomersException(@PathVariable("customerid") long id){

        throw  new ApiRequestException("API Request Exception ---"+id);


    }

    @PostMapping
    void saveCustomer(@Valid @RequestBody Customer customer){
        System.out.println("save --");
        System.out.println(customer);


    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("up --");
        System.out.println(customer);


    }

    @DeleteMapping(path="{customerid}")
    void deleteCustomer(@PathVariable("customerid")  long id){
        System.out.println("dele --");
        System.out.println(id);


    }


}
