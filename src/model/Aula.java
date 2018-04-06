package model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aula {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String dia;
	@Temporal(TemporalType.DATE)
	private Calendar aula;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Calendar getAula() {
		return aula;
	}
	public void setAula(Calendar aula) {
		this.aula = aula;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}

}
