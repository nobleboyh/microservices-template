package com.example.service1.repo;

import com.example.service1.entity.Service1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Service1Repo extends JpaRepository<Service1Entity, Long> {
}
