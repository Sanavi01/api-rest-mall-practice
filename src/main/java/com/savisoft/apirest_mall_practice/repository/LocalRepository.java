package com.savisoft.apirest_mall_practice.repository;

import com.savisoft.apirest_mall_practice.Entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}
