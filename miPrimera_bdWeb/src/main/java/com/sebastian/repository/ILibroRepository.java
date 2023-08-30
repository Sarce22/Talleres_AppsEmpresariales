package com.sebastian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.models.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long>{

}
