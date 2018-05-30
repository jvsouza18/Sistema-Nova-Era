//package beans;
//
//import dao.AlunoDAO;
//import javax.inject.Named;
//import javax.enterprise.context.SessionScoped;
//import java.io.Serializable;
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceContextType;
//import model.Aluno;
//
//@Named(value = "alunoBean")
//@SessionScoped
//public class AlunoBean implements Serializable {
//
//    @PersistenceContext(type = PersistenceContextType.EXTENDED)
//    private EntityManager manager;
//    private Aluno aluno = new Aluno();
//    @Inject
//    transient private AlunoDAO adao;
////    @Inject
////    transient private MessagesHelper mh;
////    private Part foto;
////    @Inject
////    transient private FileSaver fileSaver;
//    private Long id;
//
//    public AlunoBean() {
//    }
//
//    public Aluno getAluno() {
//        return aluno;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//}
