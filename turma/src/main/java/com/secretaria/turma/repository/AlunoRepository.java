package com.secretaria.turma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secretaria.turma.model.AlunosModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunosModel, Long> {
	public List <AlunosModel> findAllByNomeContainingIgnoreCase(String nome);
}
