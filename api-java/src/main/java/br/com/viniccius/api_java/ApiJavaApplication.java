package br.com.viniccius.api_java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniccius.api_java.model.AlunoModel;
import br.com.viniccius.api_java.model.PessoaModel;
import br.com.viniccius.api_java.repository.AlunoRepository;
import br.com.viniccius.api_java.repository.PessoaRepository;

@SpringBootApplication
public class ApiJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJavaApplication.class, args);
	}
}

@RestController
class HelloController {

	@GetMapping("/")
	public String home() {
		return "Olá, mundo!";
	}
}

@RestController
class AlunosController {

	@Autowired
	private AlunoRepository repository;

	@GetMapping("/alunos")
	public List<AlunoModel> getAllAlunos() {
		return repository.findAll();
	}
}

@RestController
class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@GetMapping("/pessoas")
	public List<PessoaModel> getAllPessoas() {
		return repository.findAll();
	}
}
