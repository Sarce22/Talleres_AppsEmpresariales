package com.sebastian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.models.Pais;

public interface IPaisRepository extends JpaRepository<Pais, Long> {

}
