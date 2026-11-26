public class Funcionario {
    private String nome;
    private String matricula;
    private String situacao;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void admitir() {
        this.situacao = "Funcionário ativo";
    }

    public void demitir() {
        this.situacao = "Funcionário desligado";
    }
}
