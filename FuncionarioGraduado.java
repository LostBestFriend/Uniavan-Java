package br.com.Alura.EmpresaUniavan;

public class FuncionarioGraduado extends Funcionario {

    protected static double valorAReceber;

    public FuncionarioGraduado(String nome, String codigoFunc) {
        super.nome = nome;
        super.codigoFuncional = codigoFunc;
    }

    @Override
    public double calcular() {
        valorAReceber = FuncionarioComMedio.valorAReceber * 2;
        return valorAReceber;
    }
}
