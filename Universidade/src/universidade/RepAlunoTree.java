package universidade;

import java.util.TreeSet;

public class RepAlunoTree implements IRepAluno {

    TreeSet<Aluno> RepAlunoTree = new TreeSet();

    @Override
    public void inserir(Aluno aluno) {
        RepAlunoTree.add(aluno);
    }

    @Override
    public void remover(String matricula) {
        RepAlunoTree.remove(matricula);
    }

    @Override
    public Aluno consultar(String matricula) {
        
    }

    @Override
    public void atualizar(Aluno a) {
           

    }

    @Override
    public void inserir(Object e) {
        
    }

    @Override
    public void remover(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno consultar(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
