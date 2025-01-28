package com.savisoft.apirest_mall_practice.repository;

import com.savisoft.apirest_mall_practice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {

    Optional<Customer> findByName(String name);
    List<Customer> findByNameContaining(String name); //Trae todos los objetos cuyo nombre tengan los caracteres llevados en el String name
    List<Customer> findByLastNameNotNull(); //Trae todos los registros que no tengan null en lastName
    //Todas estos metodos custom se pueden sacar de la documentacion de SpringBoot "Query Methods", expecificamente query creation

}
