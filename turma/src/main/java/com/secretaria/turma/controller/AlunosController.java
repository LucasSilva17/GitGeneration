package com.secretaria.turma.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secretaria.turma.model.AlunosModel;
import com.secretaria.turma.model.TurmaModel;
import com.secretaria.turma.repository.AlunoRepository;

@RequestMapping("/alunos")
@RestController
@CrossOrigin("*")
public class AlunosController {

	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<AlunosModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<AlunosModel> post(@RequestBody AlunosModel nome) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
	@PutMapping
	public ResponseEntity<AlunosModel> put(@RequestBody AlunosModel nome) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
