package com.idat.MiPrimerMicroservicioProducto.dto;


public class ProductoDTOResponse {
	
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
	public ProductoDTOResponse(Integer idColegioDTO, String nombreColegioDTO) {
		super();
		this.idColegioDTO = idColegioDTO;
		this.nombreColegioDTO = nombreColegioDTO;
	}
	public ProductoDTOResponse() {
		super();
	}
	
}
