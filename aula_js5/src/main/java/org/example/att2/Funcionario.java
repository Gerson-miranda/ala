package org.example.att2;

public abstract class Funcionario {

    protected String nome;
    protected String datanascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salario;

    public Funcionario(String nome, String datanascimento, Sexo sexo, Setor setor, double salario) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodo abstrato para calcular o salario
    public abstract double getsalarioFinal();


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
