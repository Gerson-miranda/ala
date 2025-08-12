package org.example;

import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do usuário:");
        String nome = ler.nextLine();
        String login = "ADM";


        System.out.println("Digite a senha do usuário:");
        String senhaInput = ler.nextLine();
        String senha = "123456";




        String nomeUsuario =  "ADM";
        String senhaUsuario = "123456";

        if (login.equals(nomeUsuario) && senha.equals(senhaUsuario)) {
            System.out.println("Bem-vindo, " + nomeUsuario + "!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }



    }
}
