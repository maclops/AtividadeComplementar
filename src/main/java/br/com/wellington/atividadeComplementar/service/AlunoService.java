package br.com.wellington.atividadeComplementar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wellington.atividadeComplementar.model.domain.Aluno;
import br.com.wellington.atividadeComplementar.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> buscar(String nome) {
		return repository.findByNomeContaining(nome);
	}
	
	public Optional<Aluno> buscarRa(Long ra) {
		return repository.findById(ra);
	}
	
	public List<Aluno> buscarTodos() {
		return repository.findAll();
	}

}
