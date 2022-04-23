package com.idat.idatapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.idat.idatapirest.dto.BodegaResponseDTO;
import com.idat.idatapirest.service.BodegaService;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaController {

	@Autowired
	private BodegaService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<BodegaResponseDTO>>listar(){
		
		return new ResponseEntity<List<BodegaResponseDTO>>(service.listarBodega(),HttpStatus.OK);
	}
	

	
}
