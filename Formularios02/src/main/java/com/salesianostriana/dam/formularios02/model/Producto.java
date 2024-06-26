package com.salesianostriana.dam.formularios02.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Producto {

	private long id;
	private String name;
	private String description;
	private double price;

	private String tipo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FCaducidad;
}
