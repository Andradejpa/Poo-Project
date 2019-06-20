package universidade;

public class RepAluno implements IRepAluno {

    private Aluno[] alunos;
    private int indice;
    private static final int TAM = 37;

    public RepAluno() {
        this.indice = 0;
        alunos = new Aluno[TAM];
    }

    public void inserir(Aluno aluno) {
        alunos[indice] = aluno;
        indice++;
    }

    public void remover(String matricula) {

        if (existe(matricula)) {
            int i = this.procurarIndice(matricula);
            alunos[i] = alunos[indice - 1];
            alunos[indice - 1] = null;
            indice = indice - 1;
        }

    }

    public Aluno consultar(String matricula) {
        Aluno aluno = null;
        if (existe(matricula)) {
            int i = this.procurarIndice(matricula);
            aluno = alunos[i];
        }
        return aluno;

    }

    private int procurarIndice(String matricula) {
        int i = 0;
        int ind = -1;

        for (Aluno a : alunos) {
            if ((a.getMatricula()).equals(matricula)) {
                ind = i;
                break;
            }
            i++;
        }
        return ind;
    }

    private boolean existe(String matricula) {
        boolean resp = false;

        int i = this.procurarIndice(matricula);

        if (i != -1) {
            resp = true;
        }

        return resp;
    }

    public void atualizar(Aluno a) {
        int i = procurarIndice(a.getMatricula());

        if (i != -1) {
            alunos[i] = a;
        } else {
            System.out.println("Conta nao encontrada");// usar exeção 
        }

    }

}
