package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello world!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidades da Generation: "
				+ "\n1. Mentalidade de crescimento"
				+ "\n2. Orientação ao Futuro"
				+ "\n3. Responsabilidade Pessoal"
				+ "\n4. Persistência"
				+ "\nCompetências da Generation: "
				+ "\n1. Comunicação"
				+ "\n2. Proatividade"
				+ "\n3. Orientação ao detalhe"
				+ "\n4. Trabalho em equipe";
		
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos de aprendizagem: Melhorar meu trabalho em equipe e finalizar o backend do projeto fullstack MERN que estou fazendo por conta própria.";
	}

}
