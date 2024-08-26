package heranca.polimorfismo.empresa.models;

public class EnsinoSuperior extends EnsinoMedio{

    private String universidade;

    public EnsinoSuperior(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        setRenda(super.getRenda() * 2.00);
    }

    public EnsinoSuperior(String nome, String codigoFuncional, ComissoesEnum comissoesEnum, String escola, String universidade) {
        super(nome, codigoFuncional, comissoesEnum, escola);
        this.universidade = universidade;
        setRenda(super.getRenda() * 2.00);
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
