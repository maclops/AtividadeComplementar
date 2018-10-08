package br.com.wellington.atividadeComplementar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.wellington.atividadeComplementar.model.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
	
	public List<Aluno> findByNomeContaining(@Param("nome") String nome);
	
}
