package org.example.ex2;

public class Funcionairo {
    private  int codigofuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Banco contaBancaria;

    public Funcionairo(int codigofuncionario, String nome, String endereco, String telefone, String email, Banco contaBancaria) {
        this.codigofuncionario = codigofuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public int getCodigofuncionario() {
        return codigofuncionario;
    }

    public void setCodigofuncionario(int codigofuncionario) {
        this.codigofuncionario = codigofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Banco getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(Banco contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Funcionairo{" +
                "codigofuncionario=" + codigofuncionario +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                '}';
    }
}
