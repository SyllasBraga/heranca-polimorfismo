package heranca.polimorfismo.empresa;

import heranca.polimorfismo.empresa.models.*;

/*
* As classes contidas na pasta 'empresa\models' correspondem do exercício 5 até o 11
*/
public class Main {
    public static void main(String[] args) {
        exercicioSete();
        exercicioDez();
        exercicioOnze();
    }

    private static void exercicioSete(){
        System.out.println("\n----------- EXERCÍCIO 07 -----------\n");
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new EnsinoBasico("João", "001", "Escola ABC"));
        empresa.adicionarFuncionario(new EnsinoBasico("Maria", "002", "Escola DEF"));
        empresa.adicionarFuncionario(new EnsinoBasico("José", "003", "Escola XYZ"));
        empresa.adicionarFuncionario(new EnsinoBasico("Roberto", "004", "Escola STU"));

        empresa.adicionarFuncionario(new EnsinoMedio("Ana", "005", "Escola DEF"));
        empresa.adicionarFuncionario(new EnsinoMedio("Carlos", "006", "Escola GHI"));
        empresa.adicionarFuncionario(new EnsinoMedio("Fernanda", "007", "Escola PQR"));
        empresa.adicionarFuncionario(new EnsinoMedio("Breno", "008", "Escola PQR"));

        empresa.adicionarFuncionario(new EnsinoSuperior("Lucas", "009", "Escola JKL", "Universidade ABC"));
        empresa.adicionarFuncionario(new EnsinoSuperior("Beatriz", "010", "Escola MNO", "Universidade XYZ"));

        empresa.calcularCustosTotaisFuncionarios();
        System.out.println("Custos totais com funcionários sem ensino: R$"+ empresa.getTotalSemEnsino());
        System.out.println("Custos totais com funcionários com ensino básico: R$"+ empresa.getTotalSalariosEnsinoBasico());
        System.out.println("Custos totais com funcionários com ensino médio: R$"+ empresa.getTotalSalariosEnsinoMedio());
        System.out.println("Custos totais com funcionários com ensino superior: R$"+ empresa.getTotalSalariosEnsinoSuperior());
        System.out.println("Custos totais com funcionários: R$"+ empresa.getTotalSalarios());
    }

    private static void exercicioDez(){
        System.out.println("\n----------- EXERCÍCIO 10 ----------- \n");

        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new EnsinoBasico("João", "001", ComissoesEnum.VENDEDOR, "Escola ABC"));
        empresa.adicionarFuncionario(new EnsinoBasico("Maria", "002", ComissoesEnum.VENDEDOR, "Escola DEF"));
        empresa.adicionarFuncionario(new EnsinoBasico("José", "003", ComissoesEnum.VENDEDOR, "Escola XYZ"));
        empresa.adicionarFuncionario(new EnsinoBasico("Roberto", "004", ComissoesEnum.VENDEDOR, "Escola STU"));

        empresa.adicionarFuncionario(new EnsinoMedio("Ana", "005", ComissoesEnum.VENDEDOR,"Escola DEF"));
        empresa.adicionarFuncionario(new EnsinoMedio("Carlos", "006", ComissoesEnum.VENDEDOR,"Escola GHI"));
        empresa.adicionarFuncionario(new EnsinoMedio("Fernanda", "007", ComissoesEnum.VENDEDOR, "Escola PQR"));
        empresa.adicionarFuncionario(new EnsinoMedio("Breno", "008", ComissoesEnum.SUPERVISOR, "Escola PQR"));

        empresa.adicionarFuncionario(new EnsinoSuperior("Lucas", "009", ComissoesEnum.SUPERVISOR, "Escola JKL", "Universidade ABC"));
        empresa.adicionarFuncionario(new EnsinoSuperior("Beatriz", "010", ComissoesEnum.GERENTE, "Escola MNO", "Universidade XYZ"));

        empresa.calcularCustosTotaisFuncionarios();
        System.out.println("Custos totais com funcionários sem ensino: R$"+ empresa.getTotalSemEnsino());
        System.out.println("Custos totais com funcionários com ensino básico: R$"+ empresa.getTotalSalariosEnsinoBasico());
        System.out.println("Custos totais com funcionários com ensino médio: R$"+ empresa.getTotalSalariosEnsinoMedio());
        System.out.println("Custos totais com funcionários com ensino superior: R$"+ empresa.getTotalSalariosEnsinoSuperior());
        System.out.println("Custos totais com funcionários: R$"+ empresa.getTotalSalarios());
    }

    private static void exercicioOnze(){
        System.out.println("\n----------- EXERCÍCIO 11 -----------\n");
        Funcionario funcionario = new EnsinoSuperior("Beatriz", "010", ComissoesEnum.GERENTE, "Escola MNO", "Universidade XYZ");
        System.out.println(funcionario);
    }
}
