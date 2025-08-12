package org.example;

public class MetodosString {
    public static void main(String[] args) {
        String nome = "Maria";
        String sobrenome = "Silveira";

        System.out.println("Tamanho do nome : " + nome.length());
        System.out.println("Tamanho do sobrenome : " + sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toLowerCase());
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toUpperCase());
    }
}
