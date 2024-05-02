package com.salesianostriana.dam.herencia01.model;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Comida extends Producto {

	private boolean esFrio;

	private String tipo;

	public Comida(String nombre, float precio, boolean esFrio, String tipo) {
		super(nombre, precio);
		this.esFrio = esFrio;
		this.tipo = tipo;
	}

}