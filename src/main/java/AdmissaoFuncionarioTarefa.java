public class AdmissaoFuncionarioTarefa implements Tarefa {

    private Funcionario funcionario;

    public AdmissaoFuncionarioTarefa(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void executar() {
        this.funcionario.admitir();
    }

    public void cancelar() {
        this.funcionario.demitir();
    }
}
