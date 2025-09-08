package org.example.att3;

public class Motoboy extends FUncionario{

    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataDeNascimento, double salario, Sexo sexo, String placaDaMoto) {
        super(nome, cpf, dataDeNascimento, salario, sexo);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return super.salario;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salario=" + salario +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
