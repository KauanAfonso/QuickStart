package com.example.jpaSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


//O crudRepository é uma biblioteca para fazer consultas do jpa
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //lista do tipo customer e que procura o utlimo nome 
  List<Customer> findByLastName(String lastName);

  
}