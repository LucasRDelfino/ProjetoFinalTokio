package model;

public class Servico {
	private long idServ;
	private String nomeServico , descricaoServ;
	
	public long getId() {
		return idServ;
	}
	public void setId(long id) {
		this.idServ = id;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public String getDescricao() {
		return descricaoServ;
	}
	public void setDescricao(String descricao) {
		this.descricaoServ = descricao;
	}
	
	
}
