package com.example.autospring.repository;

import com.example.autospring.entities.Auto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
    Page<Auto> findAll (Pageable page);
}
