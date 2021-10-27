package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/home")
@RestController
public class controller {
	
	@GetMapping()
	public String home() {
		return "Hello World!";
	}
	
	@GetMapping("/pedro")
	public String nome() {
		return "Utilizei dos conhecimentos adquiridos em aula com slides e com os professores. Com isso criei um Endpoint na classe controller para mostrar Hello World! E outro para mostrar minhas mentalidades e habilidades utilizadas aqui.";
	}
}
