package br.com.Alura.EmpresaUniavan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcs = new ArrayList<>();

        FuncionarioComBasico func1 = new FuncionarioComBasico("Renan", "12333");
        FuncionarioComBasico func2 = new FuncionarioComBasico("Luis", "12334");
        FuncionarioComBasico func3 = new FuncionarioComBasico("Carlos", "12335");
        FuncionarioComBasico func4 = new FuncionarioComBasico("Luigi", "12336");
        FuncionarioComMedio func5 = new FuncionarioComMedio("Mario", "12337");
        FuncionarioComMedio func6 = new FuncionarioComMedio("Millena", "12338");
        FuncionarioComMedio func7 = new FuncionarioComMedio("Belo", "12339");
        FuncionarioComMedio func8 = new FuncionarioComMedio("Michelly", "12340");
        FuncionarioGraduado func9 = new FuncionarioGraduado("Joao", "12341");
        FuncionarioGraduado func10 = new FuncionarioGraduado("Pedro", "12342");

        funcs.add(func1);
        funcs.add(func2);
        funcs.add(func3);
        funcs.add(func4);
        funcs.add(func5);
        funcs.add(func6);
        funcs.add(func7);
        funcs.add(func8);
        funcs.add(func9);
        funcs.add(func10);

        double totais = 0;

        for (Funcionario func : funcs) {
            totais += func.calcular();
        }

        System.out.println(totais);
    }
}
