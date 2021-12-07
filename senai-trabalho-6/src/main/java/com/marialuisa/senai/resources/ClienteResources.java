package com.marialuisa.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marialuisa.senai.services.ClienteService;
import com.marialuisa.senai.domain.Cliente;

@RestController 
@RequestMapping(value = "/clientes")
public class ClienteResources { 
	@Autowired
private ClienteService service;
@RequestMapping
	public ResponseEntity<Cliente>find (@PathVariable Integer id){
	Cliente obj = service.buscar(id); 
	return ResponseEntity.ok().body(obj);
}
}