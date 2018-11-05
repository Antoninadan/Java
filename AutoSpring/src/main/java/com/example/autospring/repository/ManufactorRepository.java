package com.example.autospring.repository;

import com.example.autospring.entities.Manufactor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufactorRepository extends JpaRepository<Manufactor, Long> {
    List<Manufactor> findByName (String name);
}
