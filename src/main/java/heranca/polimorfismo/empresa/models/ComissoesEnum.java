package heranca.polimorfismo.empresa.models;

public enum ComissoesEnum {
    GERENTE(1500), SUPERVISOR(600), VENDEDOR(250);

    private final double comissao;

    ComissoesEnum(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
