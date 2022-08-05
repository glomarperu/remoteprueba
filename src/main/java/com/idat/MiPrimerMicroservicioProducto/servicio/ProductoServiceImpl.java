package com.idat.MiPrimerMicroservicioProducto.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTORequest;
import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTOResponse;
import com.idat.MiPrimerMicroservicioProducto.modelo.Producto;
import com.idat.MiPrimerMicroservicioProducto.repositorio.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repositorio;
	
	
	
	@Override
	public List<ProductoDTOResponse> listarColegio() {
		
		List<ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse obj = null;
		
		for(Producto producto : repositorio.findAll()){
			obj = new ProductoDTOResponse();
			obj.setIdColegioDTO(producto.getIdProducto());
			obj.setNombreColegioDTO(producto.getNombre());
			
			
			lista.add(obj);
		}
		
		return lista;
	}

	@Override
	public ProductoDTOResponse obtenerColegio(Integer id) {
		Producto producto = repositorio.findById(id).orElse(null);
		
		ProductoDTOResponse obj = new ProductoDTOResponse();
		obj.setIdColegioDTO(producto.getIdProducto());
		obj.setNombreColegioDTO(producto.getNombre());
		return obj;
	}

	@Override
	public void guardarColegio(ProductoDTORequest colegio) {
		Producto obj = new Producto();
		obj.setIdProducto(colegio.getIdColegioDTO());
		obj.setNombre(colegio.getNombreColegioDTO());
		repositorio.save(obj);
	}

	@Override
	public void actualizarColegio(ProductoDTORequest colegio) {
		Producto obj = new Producto();
		obj.setIdProducto(colegio.getIdColegioDTO());
		obj.setNombre(colegio.getNombreColegioDTO());
		repositorio.saveAndFlush(obj);

	}

	@Override
	public void eliminarColegio(Integer id) {
		repositorio.deleteById(id);;

	}

}
