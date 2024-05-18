package br.edu.senaisp.SpringDB.model;

import jakarta.validation.constraints.NotBlank;

public class Musica {
	
	private Integer id;
	
	@NotBlank
	private String nome;
	private float duracao;
	private String descricaoDireitos;
	private EGenero genero;
	
	public Musica(Integer id, String nome, float duracao, String descricaoDireitos, EGenero genero) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.descricaoDireitos = descricaoDireitos;
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getDuracao() {
		return duracao;
	}
	
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	public String getDescricaoDireitos() {
		return descricaoDireitos;
	}
	
	public void setDescricaoDireitos(String descricaoDireitos) {
		this.descricaoDireitos = descricaoDireitos;
	}

	public EGenero getGenero() {
		return genero;
	}

	public void setGenero(EGenero genero) {
		this.genero = genero;
	}
	
	
}
