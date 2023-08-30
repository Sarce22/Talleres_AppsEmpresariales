package com.sebastian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Vehiculo;
import com.sebastian.repository.IVehiculoRepository;

@Controller
@RequestMapping("/vehiculo")
public class VehiculoController {
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@GetMapping("/vehiculos")
	public String listVehiculos(Model model) {
		
		List<Vehiculo> vehiculos = vehiculoRepository.findAll();
		
		model.addAttribute("vehiculos", vehiculos); // Cambio a "vehiculos" en minúscula
		return "vehiculo"; // Esto corresponde al nombre de la plantilla Thymeleaf
	}
}

