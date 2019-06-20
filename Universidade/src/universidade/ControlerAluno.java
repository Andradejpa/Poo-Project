package universidade;

public class ControlerAluno {

    private IRepAluno repositorio;

    public void inserir(Aluno aluno) {
        repositorio.inserir(aluno);

    }

    public Aluno consultar(String matricula) throws Exception {
        Aluno aluno = null;
        aluno = repositorio.consultar(matricula);
        if (aluno == null) {
            throw new Exception("Aluno não encontrado, verifique a matricula");
        }

        return aluno;
    }

    public void remover(String matricula) throws Exception {
        if (repositorio.consultar(matricula) == null) {
            throw new Exception("Aluno não encontrado");
        }
        repositorio.remover(matricula);
    }

    public void atualizar(Aluno aluno) throws Exception {
        if (repositorio.consultar(aluno.getMatricula()) == null) {
            throw new Exception("Aluno não existe");
        } else {
            repositorio.atualizar(aluno);
        }
    }

}
