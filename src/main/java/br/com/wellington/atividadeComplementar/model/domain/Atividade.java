package br.com.wellington.atividadeComplementar.model.domain;

public class Atividade {
	
	private Integer codigo;
	private String nome;
	private Integer percentualCargaHoraria;
	private Integer maximoAtividadesSemestre;
	private Integer percentualPorAtividade;
	
	public Atividade() {
	}

	public Atividade(Integer codigo, String nome, Integer percentualCargaHoraria,
			Integer maximoAtividadesSemestre, Integer percentualPorAtividade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
		this.percentualPorAtividade = percentualPorAtividade;
	}
	
	public Integer getValorLimiteHorasAtividade(Integer totalHorasComplementares) {
		return totalHorasComplementares * percentualPorAtividade / 100;
	}
	
	public Integer getHorasAproveitadasPorAtividade(Integer totalHorasComplementares) {
		return getValorLimiteHorasAtividade(totalHorasComplementares) * percentualCargaHoraria / 100;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}

	public void setPercentualCargaHoraria(Integer percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}

	public Integer getMaximoAtividadesSemestre() {
		return maximoAtividadesSemestre;
	}

	public void setMaximoAtividadesSemestre(Integer maximoAtividadesSemestre) {
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}

	public Integer getPercentualPorAtividade() {
		return percentualPorAtividade;
	}

	public void setPercentualPorAtividade(Integer percentualPorAtividade) {
		this.percentualPorAtividade = percentualPorAtividade;
	}

}
