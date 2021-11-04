package com.panacademy.desafio2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.panacademy.desafio2.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String> {

}
