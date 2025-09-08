package org.example.att3;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String dataDeNascimento, double salario, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salario, sexo, bonificacao);
    }



    @Override
    public double obterSalarioFinal() {
        return super.salario * super.getBonificacao().getTaxa();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salario=" + salario +
                ",salariofinal=" + this.obterSalarioFinal() +
                ", sexo=" + sexo +
                '}';
    }
}
