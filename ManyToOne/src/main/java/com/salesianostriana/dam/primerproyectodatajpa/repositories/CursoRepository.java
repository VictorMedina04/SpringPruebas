package com.salesianostriana.dam.primerproyectodatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}