package com.panacademy.desafio2.service;

import java.util.List;

import com.panacademy.desafio2.model.Consulta;

public interface ConsultaService{
	
	public List<Consulta> obterTodos();
	
	public Consulta obterPorId(String id);
	
	public Consulta criar(Consulta consulta);
	
	
}
