package com.idat.MiPrimerMicroservicioProfesor.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MiPrimerMicroservicioProfesor.modelo.Profesor;
import com.idat.MiPrimerMicroservicioProfesor.repositorio.ProfesorRepository;

@Service
public class ProductoServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository repository;

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Profesor obtenerProfesor(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardarProfesor(Profesor profesor) {
		repository.save(profesor);
		
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		repository.saveAndFlush(profesor);
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
		repository.deleteById(id);
		
	}
	
	


}
