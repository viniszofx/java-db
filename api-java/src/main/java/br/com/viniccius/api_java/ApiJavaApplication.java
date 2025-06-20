package br.com.viniccius.api_java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniccius.api_java.model.AlunoModel;
import br.com.viniccius.api_java.model.PessoaModel;
import br.com.viniccius.api_java.repository.AlunoRepository;
import br.com.viniccius.api_java.repository.PessoaRepository;
import jakarta.validation.Valid;

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
	public ResponseEntity<?> getAllAlunos() {
		try {
			List<AlunoModel> alunos = repository.findAll();
			if (alunos.isEmpty()) {
				return ResponseEntity.ok("Nenhum aluno encontrado no banco de dados.");
			}
			return ResponseEntity.ok(alunos);
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro ao buscar alunos: " + e.getMessage());
		}
	}

	@PostMapping("/aluno")
	public ResponseEntity<?> createAluno(@Valid @RequestBody AlunoModel aluno) {
		try {
			// Validate required fields (handled by @Valid annotation)
			AlunoModel savedAluno = repository.save(aluno);
			return ResponseEntity.ok(savedAluno);
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro ao criar aluno: " + e.getMessage());
		}
	}
}

@RestController
class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@GetMapping("/pessoas")
	public ResponseEntity<?> getAllPessoas() {
		try {
			List<PessoaModel> pessoas = repository.findAll();
			if (pessoas.isEmpty()) {
				return ResponseEntity.ok("Nenhuma pessoa encontrada no banco de dados.");
			}
			return ResponseEntity.ok(pessoas);
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro ao buscar pessoas: " + e.getMessage());
		}
	}

	@PostMapping("/pessoas")
	public ResponseEntity<?> createPessoa(@Valid @RequestBody PessoaModel pessoa) {
		try {
			PessoaModel savedPessoa = repository.save(pessoa);
			return ResponseEntity.ok(savedPessoa);
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro ao criar pessoa: " + e.getMessage());
		}
	}
}
