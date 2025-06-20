package br.com.viniccius.api_java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "aluno")
public class AlunoModel {

    @Id
    @Column(name = "idpessoa")
    private Long idpessoa;

    @NotBlank(message = "O campus é obrigatório")
    private String campus;

    private String polo;

    @NotBlank(message = "O email institucional é obrigatório")
    @Email(message = "Email institucional inválido")
    @Column(name = "email_institucional")
    private String email_institucional;

    private String coordenacao;

    @NotBlank(message = "O curso é obrigatório")
    private String curso;

    private String situacao;

    @NotBlank(message = "O período de entrada é obrigatório")
    @Column(name = "periodo_entrada")
    private String periodo_entrada;

    // Getters and Setters
    public Long getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getPolo() {
        return polo;
    }

    public void setPolo(String polo) {
        this.polo = polo;
    }

    public String getEmail_institucional() {
        return email_institucional;
    }

    public void setEmail_institucional(String email_institucional) {
        this.email_institucional = email_institucional;
    }

    public String getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getPeriodo_entrada() {
        return periodo_entrada;
    }

    public void setPeriodo_entrada(String periodo_entrada) {
        this.periodo_entrada = periodo_entrada;
    }
}