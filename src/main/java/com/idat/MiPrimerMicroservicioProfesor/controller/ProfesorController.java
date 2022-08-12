package com.idat.MiPrimerMicroservicioProfesor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MiPrimerMicroservicioProfesor.modelo.Profesor;
import com.idat.MiPrimerMicroservicioProfesor.servicio.ProfesorService;

@Controller
@RequestMapping("/api/v1/profesor")
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Profesor> listarProducto(){
		return service.listarProfesor();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Profesor obtenerProducto(@PathVariable Integer id){
		return service.obtenerProfesor(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarProducto(@RequestBody Profesor profesor) {
		service.guardarProfesor(profesor);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizarProducto(@RequestBody Profesor profesor) {
		service.actualizarProfesor(profesor);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminarProducto(@RequestBody Integer id) {
		service.eliminarProfesor(id);
	}
	
	

}
