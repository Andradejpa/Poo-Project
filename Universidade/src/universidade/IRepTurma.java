package universidade;

public interface IRepTurma extends IRep{

    void inserir(Turma turma);

    void remover(String codigo);

    Turma consultar(String codigo);

    void atualizar(Turma turma);

}
