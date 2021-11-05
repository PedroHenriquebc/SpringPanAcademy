package com.panacademy.consultorio.service;

import java.util.List;

import com.panacademy.consultorio.model.Consulta;

public interface ConsultaService{
	
	public List<Consulta> obterTodos();
	
	public Consulta obterPorId(String id);
	
	public Consulta criar(Consulta consulta);
	
	public Consulta reagendar(String id, Consulta consulta);
	
	public Consulta deletar(String id);
	
	
}
