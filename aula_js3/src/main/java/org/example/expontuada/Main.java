package org.example.expontuada;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua a",22,"Salvador");
        Cliente cliente1 = new Cliente("Marta",25,endereco1);

        System.out.println(cliente1);
     }
}
