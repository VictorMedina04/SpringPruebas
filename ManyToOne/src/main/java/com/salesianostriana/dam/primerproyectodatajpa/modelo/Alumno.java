package com.salesianostriana.dam.primerproyectodatajpa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
	private String apellidos;
	private String email;

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_alumno_curso"))
	private Curso curso;

	public Alumno(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;

	}

	public void addToCurso(Curso c) {
		this.curso = c;
		c.getAlumnos().add(this);
	}

	public void removeToCurso(Curso c) {
		this.curso = c;
		c.getAlumnos().remove(this);
		this.curso = null;
	}

}