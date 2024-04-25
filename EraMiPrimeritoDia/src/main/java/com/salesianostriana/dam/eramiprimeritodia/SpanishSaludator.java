package com.salesianostriana.dam.eramiprimeritodia;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator {

	@Override
	public void imprimiSaludo() {
		System.out.println("Hola a todos los programadores de 1ºDAM");
	}

}
