package org.example.att3;

public abstract class FUncionario implements SalarioFinal{

    protected String nome;
    protected String cpf;
    protected String DataDeNascimento;
    protected double salario;
    protected Sexo sexo;

    public FUncionario(String nome, String cpf, String dataDeNascimento, double salario, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        DataDeNascimento = dataDeNascimento;
        this.salario = salario;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "FUncionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salario=" + salario +
                ", sexo=" + sexo +
                '}';
    }
}
