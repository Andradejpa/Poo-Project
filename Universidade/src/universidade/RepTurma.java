package universidade;

public class RepTurma implements IRepTurma {

    private Turma[] turma;
    private int indice;
    private static final int TAM = 37;

    public RepTurma() {
        this.indice = 0;
        turma = new Turma[TAM];
    }

    public void inserir(Turma t) {
        turma[indice] = t;
        indice++;

    }

    public void remover(String codigoTurma) {

        if (existe(codigoTurma)) {
            int i = this.procurarIndice(codigoTurma);
            turma[i] = turma[indice - 1];
            turma[indice - 1] = null;
            indice = indice - 1;
        }
    }

    public Turma consultar(String codigo) {
        Turma t = null;
        if (existe(codigo)) {
            int i = this.procurarIndice(codigo);
            t = turma[i];
        }
        return t;
    }

    private int procurarIndice(String codigo) {
        int i = 0;
        int ind = -1;

        for (Turma a : turma) {
            if ((a.getCodigoTurma()).equals(codigo)) {
                ind = i;
                break;
            }
            i++;
        }
        return ind;

    }

    private boolean existe(String codigo) {
        boolean resp = false;

        int i = this.procurarIndice(codigo);

        if (i != -1) {
            resp = true;
        }

        return resp;

    }

    public void atualizar(Turma t) {
        int i = procurarIndice(t.getCodigoTurma());

        if (i != -1) {
            turma[i] = t;
        } else {
            System.out.println("Conta nao encontrada");// usar exeção 
        }
    }

}
