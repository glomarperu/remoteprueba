package com.idat.MiPrimerMicroservicioProducto.dto;


public class ProductoDTORequest {

	private Integer idColegioDTO;
	private String nombreColegioDTO;
	
	public Integer getIdColegioDTO() {
		return idColegioDTO;
	}
	public void setIdColegioDTO(Integer idColegioDTO) {
		this.idColegioDTO = idColegioDTO;
	}
	public String getNombreColegioDTO() {
		return nombreColegioDTO;
	}
	public void setNombreColegioDTO(String nombreColegioDTO) {
		this.nombreColegioDTO = nombreColegioDTO;
	}
	public ProductoDTORequest(Integer idColegioDTO, String nombreColegioDTO) {
		super();
		this.idColegioDTO = idColegioDTO;
		this.nombreColegioDTO = nombreColegioDTO;
	}
	public ProductoDTORequest() {
		super();
	}
	
	
}
