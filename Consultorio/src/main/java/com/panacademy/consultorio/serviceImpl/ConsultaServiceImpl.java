package com.panacademy.consultorio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panacademy.consultorio.model.Consulta;
import com.panacademy.consultorio.model.Medico;
import com.panacademy.consultorio.repository.ConsultaRepository;
import com.panacademy.consultorio.repository.MedicoRepository;
import com.panacademy.consultorio.service.ConsultaService;

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
		 Medico med = this.medicoRepository
				.findById(consulta.getMedico().getId())
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente"));
		consulta.setMedico(med);
		return this.consultaRepository.save(consulta);
	}

	@Override
	public Consulta reagendar(String id, Consulta consulta) {
		Consulta novaConsulta = obterPorId(id);
		novaConsulta.setData(consulta.getData());
		return this.consultaRepository.save(novaConsulta);
	}

	@Override
	public Consulta deletar(String id) {
		Consulta retorno = obterPorId(id);
		this.consultaRepository.deleteById(id);
		return retorno;
		
	}

}
