package com.idat.MiPrimerMicroservicioProducto.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.MiPrimerMicroservicioProducto.modelo.Producto;
import com.idat.MiPrimerMicroservicioProducto.repositorio.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto obtenerProducto(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardarProducto(Producto producto) {
		repository.save(producto);
		
	}

	@Override
	public void actualizarProducto(Producto producto) {
		repository.saveAndFlush(producto);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
		
	}
	
	


}
