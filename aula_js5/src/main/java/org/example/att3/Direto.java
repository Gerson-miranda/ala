package org.example.att3;

public class Direto extends CargoDeConfianca implements Contracacao{

    private final double premio = 1.1;

    public Direto(String nome, String cpf, String dataDeNascimento, double salario, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salario, sexo, bonificacao);
    }

    public double getPremio() {
        return premio;
    }

    @Override
    public void admitir(FUncionario funcionario) {
        System.out.println("Funcionario \n " + funcionario.toString() + " admitido!");
    }

    @Override
    public void demitir(FUncionario funcionario) {
        System.out.println("Funcionario \n " + funcionario.toString() + " demitido!");
    }

    @Override
    public String toString() {
        return "Direto{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salario=" + salario +
                ", sexo=" + sexo +
                '}';
    }
}
