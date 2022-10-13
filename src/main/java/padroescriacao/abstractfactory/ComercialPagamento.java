package padroescriacao.abstractfactory;

public class ComercialPagamento implements Comercial {

    public String emitirNota() {
        return "Nota de Pagamento";
    }
}
