package com.sebastian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Equipo;
import com.sebastian.repository.IEquipoRepository;

@Controller
@RequestMapping("/equipo")
public class EquipoController {
	
	@Autowired
    private IEquipoRepository equipoRepository;

    @GetMapping("/equipos")
    public String listEquipo(Model model) {
        // Obtener todos los usuarios de la base de datos
        List<Equipo> equipos = equipoRepository.findAll();

        model.addAttribute("equipos", equipos);
        return "equipo"; // Retorna el nombre del archivo HTML en src/main/resources/templates
    }

}
