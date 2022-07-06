package model;

import java.sql.Date;

public class Cliente {
	private int idade;
	private long id,telefone,cpf,cep;
	private String nome,email;
	


	public Cliente() {
		
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getTelefone() {
		return telefone;
	}



	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}



	public long getCpf() {
		return cpf;
	}



	public void setCpf(long cpf) {
		this.cpf = cpf;
	}



	public long getCep() {
		return cep;
	}



	public void setCep(long cep) {
		this.cep = cep;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	

}