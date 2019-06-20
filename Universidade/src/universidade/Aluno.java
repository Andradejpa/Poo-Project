package universidade;

public abstract class Aluno implements Comparable<Aluno> {
    
    private String nome;
    private String matricula;
    private TipoAluno tipoAluno;
    private Endereco endereco;
    private String telefone;
    
    public Aluno(String matricula) {
        
        this.matricula = matricula;
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }
    
    public void setTipoAluno(TipoAluno tipoAluno) {
        this.tipoAluno = tipoAluno;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public int compareTo(Aluno o) {
        return this.getMatricula().compareTo(o.getMatricula());
        
    }
    
}
