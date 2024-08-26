package heranca.polimorfismo.empresa.models;

public class EnsinoBasico extends Funcionario{

    private String escola;

    public EnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        setRenda(super.getRenda() * 1.10);
    }

    public EnsinoBasico(String nome, String codigoFuncional, ComissoesEnum comissoesEnum, String escola) {
        super(nome, codigoFuncional, comissoesEnum);
        this.escola = escola;
        setRenda(super.getRenda() * 1.10);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
