package com.sebastian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.models.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long>{

}
