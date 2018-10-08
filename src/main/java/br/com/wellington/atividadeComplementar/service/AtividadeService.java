package br.com.wellington.atividadeComplementar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wellington.atividadeComplementar.model.domain.Atividade;
import br.com.wellington.atividadeComplementar.repository.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository repository;
	
	public AtividadeService(AtividadeRepository repository) {
		this.repository = repository;
	}
	
	public Atividade getOne(Integer id) {
		return repository.getOne(id);
	}
	
	public List<Atividade> findByName(String name) {
		return repository.findByNomeContaining(name);
	}

}
