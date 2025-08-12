package org.example;

public class objeto {
    public static void main(String[] args) {
        pessao p1 = new pessao();
        produto p2 = new produto();

        p1.nome = "João";
        p1.idade = 30;

        p2.nome = "Notebook";
        p2.preco = 2500.00;


        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);

        System.out.println("Nome do Produto: " + p2.nome);
        System.out.println("Preço do Produto: " + p2.preco);
    }
}
