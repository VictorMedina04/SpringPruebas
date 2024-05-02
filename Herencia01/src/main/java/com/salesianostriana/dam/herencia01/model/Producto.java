package com.salesianostriana.dam.herencia01.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
public abstract class Producto {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;

	private float precio;

	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
}