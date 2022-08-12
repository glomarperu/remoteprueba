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
import com.idat.MiPrimerMicroservicioProducto.modelo.Producto;
import com.idat.MiPrimerMicroservicioProducto.servicio.ProductoService;

@Controller
@RequestMapping("/api/v1/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Producto> listarProducto(){
		return service.listarProducto();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Producto obtenerProducto(@PathVariable Integer id){
		return service.obtenerProducto(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarProducto(@RequestBody Producto producto) {
		service.guardarProducto(producto);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizarProducto(@RequestBody Producto producto) {
		service.actualizarProducto(producto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminarProducto(@RequestBody Integer id) {
		service.eliminarProducto(id);
	}
	
	

}
