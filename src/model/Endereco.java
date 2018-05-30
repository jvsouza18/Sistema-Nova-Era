package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private String cep;
	private String cidade;
	private String bairro;
	private String complemento;
	private String logradouro;
	
	public String getCidade() {
		return cidade;
	}
	public Endereco() {}
	public Endereco(String cep, String cidade, String bairro, String complemento, String logradouro) {
	
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.logradouro = logradouro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
