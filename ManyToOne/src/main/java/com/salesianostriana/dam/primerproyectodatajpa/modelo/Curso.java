package com.salesianostriana.dam.primerproyectodatajpa.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Curso {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre, tutor;

	// lo que se pone en el mapped by es el nombre en la clase de enfrete que tiene
	// el nombre del atributo anotado con many to one
	@OneToMany(mappedBy = "curso")
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}

}