package com.panacademy.desafio2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panacademy.desafio2.model.Consulta;
import com.panacademy.desafio2.repository.ConsultaRepository;
import com.panacademy.desafio2.repository.MedicoRepository;
import com.panacademy.desafio2.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	private ConsultaRepository consultaRepository;
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Override
	public List<Consulta> obterTodos() {
		return this.consultaRepository.findAll();
	}

	@Override
	public Consulta obterPorId(String id) {
		return this.consultaRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Consulta inexistente"));
	}

	@Override
	public Consulta criar(Consulta consulta) {
		 this.medicoRepository
				.findById(consulta.getMedico().getId())
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente"));
		return this.consultaRepository.save(consulta);
	}

}
