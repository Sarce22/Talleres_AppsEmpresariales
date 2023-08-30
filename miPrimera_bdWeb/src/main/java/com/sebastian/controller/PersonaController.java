package com.sebastian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Persona;
import com.sebastian.repository.IPersonaRepository;

@Controller
@RequestMapping ("/persona")
public class PersonaController {

	@Autowired
	private IPersonaRepository personaRepository;
	
	@GetMapping("/Personas")
    public String listUsers(Model model) {
        // Obtener todos los usuarios de la base de datos
        List<Persona> personas = personaRepository.findAll();

        model.addAttribute("personas", personas);
        return "persona"; // Retorna el nombre del archivo HTML en src/main/resources/templates
    }
}
