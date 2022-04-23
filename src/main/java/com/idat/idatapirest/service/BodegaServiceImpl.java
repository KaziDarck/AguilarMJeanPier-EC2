package com.idat.idatapirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.dto.BodegaRequestDTO;
import com.idat.idatapirest.dto.BodegaResponseDTO;
import com.idat.idatapirest.model.Bodega;
import com.idat.idatapirest.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	private BodegaRepository repository;
	
	@Override
	public void guardarBodega(BodegaRequestDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarBodega(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void editarBodega(BodegaRequestDTO p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BodegaResponseDTO> listarBodega() {

		List<Bodega> bodega = repository.findAll();
		List<BodegaResponseDTO> dto = new ArrayList<BodegaResponseDTO>();
		BodegaResponseDTO bodegaDTO = null;
		
		for (Bodega c : bodega) {
			bodegaDTO = new BodegaResponseDTO();
			bodegaDTO.setIdBodega(c.getIdBodega());
			
			dto.add(bodegaDTO);
		}
		
		return dto;
	}

	@Override
	public BodegaResponseDTO bodegaById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
