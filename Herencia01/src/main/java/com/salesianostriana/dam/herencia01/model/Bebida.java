package com.salesianostriana.dam.herencia01.model;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Bebida extends Producto {

	// Tamaño de la bebida expresado en centilitros
	private int tamanio;

	public Bebida(String nombre, float precio, int tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
	}
}