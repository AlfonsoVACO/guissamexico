package com.guissa.guissa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guissa.guissa.models.entidades.TipoUsuario;
import com.guissa.guissa.services.TipoUsuarioService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	@Autowired
	@Qualifier("servicioTipousuario")
	private TipoUsuarioService servicioTipousuario;

	@GetMapping("/getrest")
	public ResponseEntity<List<TipoUsuario>> getRest(){
		
		
		return new ResponseEntity<List<TipoUsuario>>(servicioTipousuario.listAllTipoUsuario(),HttpStatus.OK);
	}
}
