package org.example.att2;

public class Diretor extends Funcionario implements Contratacao{

    private final double premio = 0.2;

    public Diretor(String nome, String datanascimento, Sexo sexo, Setor setor, double salario) {
        super(nome, datanascimento, sexo, setor, salario);
    }

    public double getPremio() {
        return premio;
    }

    // Implementa os metodos da interface Contratacao
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitido: \n " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitido: \n " + funcionario.toString());
    }
// Retorna o salario mais o premio
    @Override
    public double getsalarioFinal() {
        return super.salario + (super.salario * this.premio);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "setor=" + setor +
                ", premio=" + premio +
                ", nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", salario=" + salario +
                ", salariofinal=" + this.getsalarioFinal()  +
                '}';
    }
}
