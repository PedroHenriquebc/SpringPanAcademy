package com.panacademy.consultorio.controller;

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

import com.panacademy.consultorio.model.Medico;
import com.panacademy.consultorio.serviceImpl.MedicoServiceImpl;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoServiceImpl medicoServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Medico>> obterTodos(){
		List<Medico> list = medicoServiceImpl.obterTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Medico> obterPorId(@PathVariable String id){
		Medico medico = medicoServiceImpl.obterPorId(id);
		return ResponseEntity.ok().body(medico);
	}
	
	@PostMapping
	public ResponseEntity<Medico> criar(@RequestBody Medico medico){
		Medico novaMedico = medicoServiceImpl.criar(medico);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novaMedico.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
