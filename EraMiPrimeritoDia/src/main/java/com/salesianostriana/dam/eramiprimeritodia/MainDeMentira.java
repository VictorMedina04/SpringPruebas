package com.salesianostriana.dam.eramiprimeritodia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.eramiprimeritodia.Saludator;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator")
	private Saludator s;

	@PostConstruct
	public void init() {
		s.imprimiSaludo();
	}
}
