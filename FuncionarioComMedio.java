package br.com.Alura.EmpresaUniavan;

public class FuncionarioComMedio extends Funcionario {

    protected static double valorAReceber;

    public FuncionarioComMedio(String nome, String codigoFunc) {
        super.nome = nome;
        super.codigoFuncional = codigoFunc;
    }

    @Override
    public double calcular() {
        valorAReceber = FuncionarioComBasico.valorAReceber * 1.5;
        return valorAReceber;
    }
}
