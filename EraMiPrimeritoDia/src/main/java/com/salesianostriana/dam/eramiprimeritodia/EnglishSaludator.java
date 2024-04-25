package com.salesianostriana.dam.eramiprimeritodia;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.eramiprimeritodia.Saludator;

@Service
public class EnglishSaludator implements Saludator {

	@Override
	public void imprimiSaludo() {
		System.out.println("Hello coders of 1ºDAM");
	}

}
