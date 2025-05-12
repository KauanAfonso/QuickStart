package com.example.jpaSpring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;

import java.beans.Customizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerController {


    @Autowired //injetando a instancia automaticamente
    private CustomerRepository customerRepository;


    @GetMapping("/costumers")
    public Iterable<Customer> getAllCustomers(){ //tipo iteravel de costumers
        return customerRepository.findAll();//pegando todos
    }

    @GetMapping("/costumers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){
        return customerRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

}
