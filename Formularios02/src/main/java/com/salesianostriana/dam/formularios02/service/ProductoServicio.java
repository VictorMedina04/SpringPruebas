package com.salesianostriana.dam.formularios02.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

	public String[] getTipos() {
		String[] tipos = new String[] { "Cruzcampo", "Alhambra", "1906", "Cosas malas" };
		return tipos;
	}
}
