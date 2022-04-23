package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.BodegaRequestDTO;
import com.idat.idatapirest.dto.BodegaResponseDTO;

public interface BodegaService {
	
	public void guardarBodega(BodegaRequestDTO p);
	public void eliminarBodega(Integer id);
	public void editarBodega(BodegaRequestDTO p);
	public List<BodegaResponseDTO> listarBodega();
	public BodegaResponseDTO bodegaById(Integer id);

}
