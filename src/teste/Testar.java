package teste;

import java.util.Calendar;
import javax.persistence.EntityManager;
import model.Aluno;
import model.Endereco;
import model.ReferenciaAluno;
import model.Sexo;

public class Testar {
	
	public static void main(String[] args) {
	
		
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
		Endereco endRef = new Endereco("11040290","Santos","Boqueirão","15","Rua Bahia");
		Endereco endAluno1 = new Endereco("112983782","Santos","Gonzaga","20","Rua Amazonas");
		ReferenciaAluno referenciaAluno1 = new ReferenciaAluno("Janaina eller",endRef,322898122);
		Aluno a1 = new Aluno("João Victor","22390293020",Calendar.getInstance(),32272198,
				991082154,Sexo.Masculino,referenciaAluno1,endAluno1);
		
		 

	        em.persist(endRef); 
	        em.persist(endAluno1); 

	        em.persist(referenciaAluno1);
	        em.persist(a1);
	        

	        em.getTransaction().commit();
	        em.close();
		
		
		
		
	}
	
	
}
