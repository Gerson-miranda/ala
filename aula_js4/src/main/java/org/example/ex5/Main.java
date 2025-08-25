package org.example.ex5;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua A", "123", "Apto 1", "Bairro B", "Cidade C", Uf.BAHIA, "12345-678");
        Pessoa pessoa = new Pessoa("João Silva", "123.456.789-00", Sexo.MASCULINO, endereco, 1, 30, "(11) 91234-5678");

        System.out.println(pessoa.toString());
    }
}
