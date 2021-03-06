package br.com.wellington.atividadeComplementar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellington.atividadeComplementar.model.domain.Aluno;
import br.com.wellington.atividadeComplementar.service.AlunoService;


@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	@RequestMapping(value="like/{nome}", method=RequestMethod.GET)
	public ResponseEntity<?> findByNome(@PathVariable String nome) {
		List<Aluno> alunos = service.buscar(nome);
		return ResponseEntity.ok().body(alunos);
	}
	
	@RequestMapping(value="{ra}", method=RequestMethod.GET)
	public ResponseEntity<?> findByRa(@PathVariable Long ra) {
		Optional<Aluno> aluno = service.buscarRa(ra);
		return ResponseEntity.ok().body(aluno);
	}

}
