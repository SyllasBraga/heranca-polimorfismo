package heranca.polimorfismo.empresa.models;

public class Empresa {

    private Funcionario[] funcionarios;
    private double totalSalarios;
    private double totalSemEnsino;
    private double totalSalariosEnsinoBasico;
    private int cont;
    private double totalSalariosEnsinoMedio;
    private double totalSalariosEnsinoSuperior;

    public Empresa() {
        this.funcionarios = new Funcionario[10];
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios[cont] = funcionario;
        cont++;
    }

    public void calcularCustosTotaisFuncionarios(){
        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.getRenda();

            ComissoesEnum comissoes = funcionario.getComissoesEnum();
            renda += comissoes != null ? comissoes.getComissao() : 0;

            totalSalarios += renda;

            switch (funcionario) {
                case EnsinoBasico _ when !(funcionario instanceof EnsinoMedio) ->
                        totalSalariosEnsinoBasico += renda;
                case EnsinoMedio _ when !(funcionario instanceof EnsinoSuperior) ->
                        totalSalariosEnsinoMedio += renda;
                case EnsinoSuperior _ -> totalSalariosEnsinoSuperior += renda;
                default -> totalSemEnsino = renda;
            }
        }
    }

    public double getTotalSalarios() {
        return totalSalarios;
    }

    public double getTotalSemEnsino() {
        return totalSemEnsino;
    }

    public double getTotalSalariosEnsinoBasico() {
        return totalSalariosEnsinoBasico;
    }

    public double getTotalSalariosEnsinoMedio() {
        return totalSalariosEnsinoMedio;
    }

    public double getTotalSalariosEnsinoSuperior() {
        return totalSalariosEnsinoSuperior;
    }
}
