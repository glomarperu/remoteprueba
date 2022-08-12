package com.idat.MiPrimerMicroservicioProducto.servicio;

import java.util.List;

import com.idat.MiPrimerMicroservicioProducto.modelo.Producto;

public interface ProductoService {

	public List<Producto> listarProducto();
	public Producto obtenerProducto(Integer id);
	public void guardarProducto(Producto producto);
	public void actualizarProducto(Producto producto);
	public void eliminarProducto(Integer id);
}
