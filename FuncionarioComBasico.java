package br.com.Alura.EmpresaUniavan;

public class FuncionarioComBasico extends Funcionario {

    protected static double valorAReceber;

    public FuncionarioComBasico(String nome, String codigoFunc) {
        super.nome = nome;
        super.codigoFuncional = codigoFunc;
    }

    @Override
    public double calcular() {
        valorAReceber = Funcionario.valorBase * 1.1;
        return valorAReceber;
    }
}
