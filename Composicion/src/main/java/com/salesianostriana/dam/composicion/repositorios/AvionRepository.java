package com.salesianostriana.dam.composicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.composicion.modelo.Avion;

public interface AvionRepository extends JpaRepository<Avion, Long> {

}
