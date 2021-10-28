package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Atividade2;

@RequestMapping(path = "/home")
@RestController
public class controller {
	
	@GetMapping()
	public String home() {
		return "Hello World!";
	}
	
	@GetMapping("/ativ1")
	public String ativ1() {
		return "Utilizei dos conhecimentos adquiridos em aula com slides e com os professores. "
				+ "Com isso criei um Endpoint na classe controller para mostrar Hello World! "
				+ "E outro para mostrar minhas mentalidades e habilidades utilizadas aqui.";
	}
	@GetMapping("/ativ2")
	public Atividade2 ativ2() {
		Atividade2 ativ2 = new Atividade2();
		ativ2.setApredizado("Fundamentos básicos do Spring Boot e o padrão MVC");
		ativ2.setExpectativa("Espero aprender mais sobre as Annotations e conhecer melhor como 'conectar' cada camada do padrão MVC");
		return ativ2;
	}
}
