package com.secretaria.turma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "aluno")
public class AlunosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotNull
	private boolean matriculado;

	@ManyToOne
	@JsonIgnoreProperties("alunos")
	private TurmaModel turmamodel;

	public TurmaModel getTurmamodel() {
		return turmamodel;
	}

	public void setTurmamodel(TurmaModel turmamodel) {
		this.turmamodel = turmamodel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

}
