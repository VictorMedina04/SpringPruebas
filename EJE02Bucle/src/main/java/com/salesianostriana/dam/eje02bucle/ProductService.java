package com.salesianostriana.dam.eje02bucle;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Producto> getLista() {
		return Arrays.asList(
				new Producto(1, "Botijo", "Enfria hasta menos de 10 grados", 20.5055, true, LocalDateTime.now()),
				new Producto(2, "Botijo Extra", "Enfria hasta menos de 200 grados", 200.50, true, LocalDateTime.now()));
	}
}