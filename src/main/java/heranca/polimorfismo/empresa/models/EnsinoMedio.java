package heranca.polimorfismo.empresa.models;

public class EnsinoMedio extends EnsinoBasico {
    public EnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        setRenda(super.getRenda() * 1.50);
    }

    public EnsinoMedio(String nome, String codigoFuncional, ComissoesEnum comissoesEnum, String escola) {
        super(nome, codigoFuncional, comissoesEnum, escola);
        setRenda(super.getRenda() * 1.50);
    }
}
