package com.panacademy.desafio2.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.panacademy.desafio2.model.Consulta;
import com.panacademy.desafio2.serviceImpl.ConsultaServiceImpl;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaServiceImpl consultaServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Consulta>> obterTodos(){
		List<Consulta> list = consultaServiceImpl.obterTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Consulta> obterPorId(@PathVariable String id){
		Consulta consulta = consultaServiceImpl.obterPorId(id);
		return ResponseEntity.ok().body(consulta);
	}
	
	@PostMapping
	public ResponseEntity<Consulta> criar(@RequestBody Consulta consulta){
		Consulta novaConsulta = consultaServiceImpl.criar(consulta);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novaConsulta.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
