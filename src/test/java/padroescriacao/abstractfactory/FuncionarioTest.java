package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @Test
    void deveEmitirNotaContratacao() {
        RecursosHumanos rh = new RecursosHumanosContratacao();
        Funcionario funcionario = new Funcionario(rh);
        assertEquals("Nota de Venda", funcionario.emitirNotaComer());
    }

    @Test
    void deveEmitirNotaAluguel() {
        RecursosHumanos rh = new RecursosHumanosContratacao();
        Funcionario funcionario = new Funcionario(rh);
        assertEquals("Produto alugado", funcionario.emitirNotaAlmo());
    }

    @Test
    void deveEmitirDiplomaGraduacao() {
        RecursosHumanos rh = new RecursosHumanosDemissao();
        Funcionario funcionario = new Funcionario(rh);
        assertEquals("Nota de Pagamento", funcionario.emitirNotaComer());
    }

    @Test
    void deveEmitirNotaDemissaoDevolucao() {
        RecursosHumanos rh = new RecursosHumanosDemissao();
        Funcionario funcionario = new Funcionario(rh);
        assertEquals("Produto devolvido", funcionario.emitirNotaAlmo());
    }

}