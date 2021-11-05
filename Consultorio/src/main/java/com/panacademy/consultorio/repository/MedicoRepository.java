package com.panacademy.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.panacademy.consultorio.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String> {

}
