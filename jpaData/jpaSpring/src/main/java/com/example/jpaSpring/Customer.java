package com.example.jpaSpring;


import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//@Entity indica que é uma entidade JPa , ou seja ira criar uma tabela Customer
@Entity
public class Customer{

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO) //Gerar o id automaticamente
  private Long id;
  private String firstName;
  private String lastName;

  protected Customer() {} //classe protegida para o jpa

  //classe construtora padrão
  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  //polimorfismo do metodo toString
  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

  //Obtendo objetos:
  
  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}