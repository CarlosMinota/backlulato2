package com.agrogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrogram.dto.UsuarioDTO;
import com.agrogram.services.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/addUsuario")
	public ResponseEntity<?> addUsuario(@RequestBody UsuarioDTO usuarioDTO){
		try {
			return ResponseEntity.ok().body(usuarioService.addUsuario(usuarioDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
