package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Alumno;
import com.salesianostriana.dam.primerproyectodatajpa.modelo.Curso;
import com.salesianostriana.dam.primerproyectodatajpa.repositories.AlumnoRepository;
import com.salesianostriana.dam.primerproyectodatajpa.repositories.CursoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepository alumnoRepositorio;

	@Autowired
	private CursoRepository cursoRepositorio;

	@PostConstruct
	public void ejecutar() {
		Curso c = new Curso("1ºDAM", "Miguel Campos");
		cursoRepositorio.save(c);

		Alumno a = new Alumno("Luis Miguel", "López Magaña", "luismi.lopez@salesianos.edu");
		a.addToCurso(c);
		Alumno a1 = new Alumno("Ángel", "Naranjo González", "angel.naranjo@salesianos.edu");
		a1.addToCurso(c);
		Alumno a2 = new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu");
		a2.addToCurso(c);
		alumnoRepositorio.save(a);
		alumnoRepositorio.save(a1);
		alumnoRepositorio.save(a2);
		alumnoRepositorio.findAll().forEach(System.out::println);
	}
}