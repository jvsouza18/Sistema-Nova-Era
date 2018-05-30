package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Chamada {
	
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Id
	 private Integer id;
	
	 @OneToMany
	 private List<Aluno> aluno;

	 @OneToOne
	 private Turma turma;
	 
	 @OneToMany
	 private List<Aula> aula;
	 

	 @ManyToOne
	 private Funcionario funcionario;
	 

	 public Turma getTurma() {
		return turma;
	 }
	 public void setTurma(Turma turma) {
		this.turma = turma;
	 }


	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	 public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	 public List<Aula> getAula() {
		return aula;
	}
	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}
}
