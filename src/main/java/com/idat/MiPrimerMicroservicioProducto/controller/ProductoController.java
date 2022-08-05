package com.idat.MiPrimerMicroservicioProducto.controller;

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

import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTORequest;
import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTOResponse;
import com.idat.MiPrimerMicroservicioProducto.servicio.ProductoService;

@Controller
@RequestMapping("/api/v1/producto")
public class ProductoController {
	@Autowired
	private ProductoService service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<ProductoDTOResponse> listarColegios(){
		return service.listarColegio();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody ProductoDTOResponse obtenerColegio(@PathVariable Integer id) {
		return service.obtenerColegio(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarColegio(@RequestBody ProductoDTORequest colegio) {
		service.guardarColegio(colegio);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody  void actualizarColegio(@RequestBody ProductoDTORequest colegio) {
		
		service.actualizarColegio(colegio);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminarColegio(@RequestBody Integer id) {
		
		service.eliminarColegio(id);
}
	
	

}
