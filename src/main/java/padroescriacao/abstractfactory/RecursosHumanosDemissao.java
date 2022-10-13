package padroescriacao.abstractfactory;

public class RecursosHumanosDemissao implements RecursosHumanos {

    @Override
    public Comercial createContrato() {
        return new ComercialPagamento();
    }

    @Override
    public Almoxarifado createMaterial() {
        return new AlmoxarifadoDevolucao();
    }
}
