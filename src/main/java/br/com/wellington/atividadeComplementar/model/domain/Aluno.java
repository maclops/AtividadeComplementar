package br.com.wellington.atividadeComplementar.model.domain;

public class Aluno {
	
	private long ra;
	private String nome;

	public Aluno() {
	}

	public Aluno(long ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}

	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
