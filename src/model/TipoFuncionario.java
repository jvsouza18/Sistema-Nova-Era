package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoFuncionario {
		
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	String nome;
		
}
