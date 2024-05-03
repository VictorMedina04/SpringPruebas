package com.salesianostriana.dam.crud01.servicebase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServicioBaseImp<T, ID, R extends JpaRepository<T, ID>> implements ServicioBase<T, ID> {

	@Autowired
	protected R repositorio;

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> findById(ID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public T save(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T edit(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(ID id) {
		// TODO Auto-generated method stub

	}

}
