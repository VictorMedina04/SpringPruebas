package com.salesianostriana.dam.clinicavictormedinalejeune01.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String mostrarInicio() {
		return "pruebaProyecto";
	}
}
