package org.example.ex5;

public class Pessoa {
    private String nome;
    private String cpf;
    private Sexo sexo;
    private Endereco endereco;
    private int id;
    private  int idade;
    private  String telefone;

    public Pessoa(String nome, String cpf, Sexo sexo, Endereco endereco, int id, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", endereco=" + endereco +
                ", id=" + id +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
