package heranca.polimorfismo.empresa.models;

public class Funcionario {

    private String nome;
    private String codigoFuncional;
    private double renda;

    private ComissoesEnum comissoesEnum;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000.0;
    }

    public Funcionario(String nome, String codigoFuncional, ComissoesEnum comissoesEnum) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissoesEnum = comissoesEnum;
        this.renda = 1000.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public ComissoesEnum getComissoesEnum() {
        return comissoesEnum;
    }

    public void setComissoesEnum(ComissoesEnum comissoesEnum) {
        this.comissoesEnum = comissoesEnum;
    }

    @Override
    public String toString() {
        return STR."Funcionario{nome='\{nome}\{'\''}, renda=\{renda}, comissao=\{comissoesEnum.getComissao()}\{'}'}";
    }
}

