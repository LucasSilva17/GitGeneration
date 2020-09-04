package com.secretaria.turma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secretaria.turma.model.TurmaModel;

import java.util.List;
@Repository
public interface TurmaRepository extends JpaRepository<TurmaModel, Long> {

	public List <TurmaModel> findAllByTurmaContainingIgnoreCase( String turma);
}
