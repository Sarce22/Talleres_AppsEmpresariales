package com.sebastian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Pais;
import com.sebastian.repository.IPaisRepository;

@Controller
@RequestMapping("/pais")
public class PaisController {
	
	@Autowired
    private IPaisRepository paisRepository;
	

	 @GetMapping("/paises")
	    public String listPaises(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Pais> paises = paisRepository.findAll();

	        model.addAttribute("paises", paises);
	        return "pais"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }
	
}
