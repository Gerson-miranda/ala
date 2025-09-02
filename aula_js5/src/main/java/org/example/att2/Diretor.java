package org.example.att2;

public class Diretor extends Funcionario implements Contratacao{

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    private double premio;


    public Diretor(String nome, String datanascimento, Sexo sexo, Setor setor, double salario, double premio) {
        super(nome, datanascimento, sexo, setor, salario);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
