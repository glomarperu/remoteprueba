package com.idat.MiPrimerMicroservicioProducto.servicio;

import java.util.List;

import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTORequest;
import com.idat.MiPrimerMicroservicioProducto.dto.ProductoDTOResponse;

public interface ProductoService {

	public List<ProductoDTOResponse> listarColegio();
	public ProductoDTOResponse obtenerColegio(Integer id);
	public void guardarColegio(ProductoDTORequest colegio);
	public void actualizarColegio(ProductoDTORequest colegio);
	public void eliminarColegio(Integer id);
}
