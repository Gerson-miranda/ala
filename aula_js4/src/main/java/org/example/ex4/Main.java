package org.example.ex4;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("1", "João", "2000", Setor.FINANCEIRO, Sexo.MASCULINO,"30");

        System.out.println(f1.toString());
    }
}
