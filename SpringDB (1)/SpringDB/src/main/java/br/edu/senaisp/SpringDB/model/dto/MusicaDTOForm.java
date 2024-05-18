package br.edu.senaisp.SpringDB.model.dto;

import java.util.List;

import br.edu.senaisp.SpringDB.model.EGenero;

public class MusicaDTOForm {
	private Integer id;
	private String nome;
	private float duracao;
	private String descricaoDireitos;
	private String genero;
	private List<String> generos;
	
	public MusicaDTOForm(Integer id, String nome, float duracao, String descricaoDireitos, String genero,
			List<String> generos) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.descricaoDireitos = descricaoDireitos;
		this.genero = genero;
		this.generos = generos;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	
	
	
}
