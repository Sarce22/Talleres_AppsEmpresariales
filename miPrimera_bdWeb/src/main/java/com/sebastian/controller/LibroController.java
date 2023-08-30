package com.sebastian.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Libro;
import com.sebastian.repository.ILibroRepository;

@Controller
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private ILibroRepository libroRepository;
	
	 @GetMapping("/libros")
	  public String listUsers(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Libro> libros = libroRepository.findAll();

	        model.addAttribute("libros", libros );
	        return "libro"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }

}
