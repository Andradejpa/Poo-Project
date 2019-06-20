package universidade;

public interface IRep<E> {

    void inserir(E e); 

    void remover(E e);

    Aluno consultar(E e);

    void atualizar(E e);
}
