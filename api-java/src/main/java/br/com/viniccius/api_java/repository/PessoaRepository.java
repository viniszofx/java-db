package br.com.viniccius.api_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viniccius.api_java.model.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}