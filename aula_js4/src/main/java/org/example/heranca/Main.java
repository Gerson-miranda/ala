package org.example.heranca;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Marta","30","30/05/2022","Cartão de crédito");

        Funcionario f1 = new Funcionario("Maria","40","462135","Desenvolvedor junior","4200.00");

        System.out.println(c1.toString());
        System.out.println(f1.toString());
    }
}
