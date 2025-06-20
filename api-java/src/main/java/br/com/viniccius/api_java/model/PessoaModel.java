package br.com.viniccius.api_java.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa")
public class PessoaModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idPessoa;
  private String nome_estudante;
  private int idade;
  private String sexo;

  public PessoaModel() {
  }

  public PessoaModel(int idade, String sexo, String nome_estudante) {
    super();
    this.nome_estudante = nome_estudante;
    this.idade = idade;
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public long getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(long idPessoa) {
    this.idPessoa = idPessoa;
  }

  public String getNome_estudante() {
    return nome_estudante;
  }

  public void setNome_estudante(String nome_estudante) {
    this.nome_estudante = nome_estudante;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}