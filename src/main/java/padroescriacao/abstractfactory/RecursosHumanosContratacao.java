package padroescriacao.abstractfactory;

public class RecursosHumanosContratacao implements RecursosHumanos {

    @Override
    public Comercial createContrato() {
        return new ComercialCompra();
    }

    @Override
    public Almoxarifado createMaterial() {
        return new AlmoxarifadoAluguel();
    }
}
