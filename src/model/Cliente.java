package model;

import java.sql.Date;

public class Cliente {
	private long id,telefone,cpf;
	private String nome,email,endereco ;
	private Date datanasc;


	public Cliente() {
		
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



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public Date getDatanasc() {
		return datanasc;
	}



	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	
	

}