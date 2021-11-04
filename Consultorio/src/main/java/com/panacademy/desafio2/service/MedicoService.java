package com.panacademy.desafio2.service;

import java.util.List;

import com.panacademy.desafio2.model.Medico;

public interface MedicoService {
	
	public List<Medico> obterTodos();
	
	public Medico obterPorId(String id);
	
	public Medico criar(Medico medico);
}
