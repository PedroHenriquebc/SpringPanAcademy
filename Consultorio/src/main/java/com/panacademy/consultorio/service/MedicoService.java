package com.panacademy.consultorio.service;

import java.util.List;

import com.panacademy.consultorio.model.Medico;

public interface MedicoService {
	
	public List<Medico> obterTodos();
	
	public Medico obterPorId(String id);
	
	public Medico criar(Medico medico);
}
