package com.step1;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class Customer {

    private  final long id;
    @NotBlank(message = "not blank any more")
    private final String name;

    @NotBlank
    private final String password;




    public Customer(long id, String name, String password) {
        this.id = id;
        this.name = name;

        this.password = password;
    }

    @JsonProperty(value = "customer_id")
    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
