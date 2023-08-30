package com.sebastian.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.models.Persona;

public interface IPersonaRepository extends JpaRepository<Persona,Long>{

}
