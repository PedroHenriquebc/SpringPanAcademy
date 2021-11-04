package com.panacademy.desafio2.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Consulta {
	
	@Id
	private String id;
	private String data;
	
	@DBRef
	private Medico medico;
	
	public Consulta() {
		
	}

	public Consulta(String data, Medico medico) {
		super();
		this.data = data;
		this.medico = medico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", data=" + data + ", medico=" + medico + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
