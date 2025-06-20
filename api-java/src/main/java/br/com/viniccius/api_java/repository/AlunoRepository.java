package br.com.viniccius.api_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viniccius.api_java.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
