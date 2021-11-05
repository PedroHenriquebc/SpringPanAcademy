package com.panacademy.consultorio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panacademy.consultorio.model.Medico;
import com.panacademy.consultorio.repository.MedicoRepository;
import com.panacademy.consultorio.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{

	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	public List<Medico> obterTodos() {
		return this.medicoRepository.findAll();
	}

	@Override
	public Medico obterPorId(String id) {
		return this.medicoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente"));
	}

	@Override
	public Medico criar(Medico medico) {
		return this.medicoRepository.save(medico);
	}

	

}
