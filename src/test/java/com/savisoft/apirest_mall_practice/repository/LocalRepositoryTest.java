package com.savisoft.apirest_mall_practice.repository;

import com.savisoft.apirest_mall_practice.Entity.Local;
import com.savisoft.apirest_mall_practice.Entity.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LocalRepositoryTest {

    @Autowired
    private LocalRepository localRepository;

    @Test
    public void saveLocal(){

        Manager manager = Manager.builder()
                .firstName("Carlos")
                .lastName("Alvarado")
                .build();

        Local local = Local.builder()
                .name("Ktronix")
                .floor("2nd floor")
                .manager(manager)
                .build();
        localRepository.save(local);
    }
}