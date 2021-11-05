package com.panacademy.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.panacademy.consultorio.model.Consulta;

@Repository
public interface ConsultaRepository extends MongoRepository<Consulta, String>{

}
