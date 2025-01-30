package com.savisoft.apirest_mall_practice.repository;

import com.savisoft.apirest_mall_practice.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
