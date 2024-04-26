package com.salesianostriana.dam.formularios01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.formularios01.model.Empleado;

@Controller
public class EmpleadoController {

	@GetMapping("/empleado")
	public String showForm(Model model) {

		// empleado para crear sus datos
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		// html q se pinta
		return "form";
	}

	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {

		model.addAttribute("empleado", empleado);
		// en este caso solo se pintan los datos pero no es lo normal
		return "view";
	}

}
