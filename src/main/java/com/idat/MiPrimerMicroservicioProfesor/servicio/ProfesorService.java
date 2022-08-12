package com.idat.MiPrimerMicroservicioProfesor.servicio;

import java.util.List;

import com.idat.MiPrimerMicroservicioProfesor.modelo.Profesor;

public interface ProfesorService {

	public List<Profesor> listarProfesor();
	public Profesor obtenerProfesor(Integer id);
	public void guardarProfesor(Profesor profesor);
	public void actualizarProfesor(Profesor profesor);
	public void eliminarProfesor(Integer id);
}
