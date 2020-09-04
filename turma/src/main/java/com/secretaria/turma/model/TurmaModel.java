package com.secretaria.turma.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "turma")
public class TurmaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	
	private String turma;

	@NotNull
	private boolean ativo;
	
	@OneToMany(mappedBy = "turmamodel",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("turma ")
	private List<AlunosModel> alunos;

	public List<AlunosModel> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<AlunosModel> alunos) {
		this.alunos = alunos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
}
