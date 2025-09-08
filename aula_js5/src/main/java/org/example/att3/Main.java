package org.example.att3;

public class Main {

    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("João Silva", "123.456.789-00", "15/03/1990", 2500.00, Sexo.MASCULINO, "ABC-1234");

        Gerente gerente = new Gerente("Maria Souza", "987.654.321-00", "22/07/1985", 5000.00, Sexo.FEMININO, Bonificacao.GERENTE);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.admitir(motoboy);
    }
}
