package org.example.att2;

public class Motoboy extends Funcionario{

private String carteiraDeHabilitacao;

    public Motoboy(String nome, String datanascimento, Sexo sexo, Setor setor, double salario, String carteiraDeHabilitacao) {
        super(nome, datanascimento, sexo, setor, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getsalarioFinal() {
        return super.salario;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                ", salariofinal=" + this.getsalarioFinal() +
                '}';
    }
}
