public class DemissaoFuncionarioTarefa implements Tarefa {

    private Funcionario funcionario;

    public DemissaoFuncionarioTarefa(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void executar() {
        this.funcionario.demitir();
    }

    public void cancelar() {
        this.funcionario.admitir();
    }
}
