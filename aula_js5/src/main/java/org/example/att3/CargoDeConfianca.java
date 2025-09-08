package org.example.att3;

public abstract class CargoDeConfianca extends FUncionario {

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataDeNascimento, double salario, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salario, sexo);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
