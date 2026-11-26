import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartamentoPessoalTest {

    DepartamentoPessoal departamentoPessoal;
    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        departamentoPessoal = new DepartamentoPessoal();
        funcionario = new Funcionario("Maria Silva", "F-001");
    }

    @Test
    void deveAdmitirFuncionario() {
        Tarefa admissaoFuncionario = new AdmissaoFuncionarioTarefa(funcionario);
        departamentoPessoal.executarTarefa(admissaoFuncionario);

        assertEquals("Funcionário ativo", funcionario.getSituacao());
    }

    @Test
    void deveDemitirFuncionario() {
        Tarefa demissaoFuncionario = new DemissaoFuncionarioTarefa(funcionario);
        departamentoPessoal.executarTarefa(demissaoFuncionario);

        assertEquals("Funcionário desligado", funcionario.getSituacao());
    }

    @Test
    void deveCancelarDemissao() {
        Tarefa admissaoFuncionario = new AdmissaoFuncionarioTarefa(funcionario);
        Tarefa demissaoFuncionario = new DemissaoFuncionarioTarefa(funcionario);

        departamentoPessoal.executarTarefa(admissaoFuncionario);
        departamentoPessoal.executarTarefa(demissaoFuncionario);

        departamentoPessoal.cancelarUltimaTarefa();

        assertEquals("Funcionário ativo", funcionario.getSituacao());
    }

}
