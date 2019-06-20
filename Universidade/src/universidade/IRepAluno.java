package universidade;

public interface IRepAluno extends IRep{

    void inserir(Aluno aluno);

    void remover(String matricula);

    Aluno consultar(String matricula);

    void atualizar(Aluno a);

}
