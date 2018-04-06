package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReferenciaAluno {

	
	public ReferenciaAluno() {}
	public ReferenciaAluno(String nome, Endereco endereco, int telefone) {

		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private String nome;
	@ManyToOne
	private Endereco endereco;
	private int telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
