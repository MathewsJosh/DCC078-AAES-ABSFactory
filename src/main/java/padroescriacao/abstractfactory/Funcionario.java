package padroescriacao.abstractfactory;

public class Funcionario {

    private Comercial comercial;
    private Almoxarifado almoxarifado;

    public Funcionario(RecursosHumanos rh) {
        this.comercial = rh.createContrato();
        this.almoxarifado = rh.createMaterial();
    }

    public String emitirNotaComer() {
        return this.comercial.emitirNota();
    }

    public String emitirNotaAlmo() {
        return this.almoxarifado.emitirNota();
    }
}
