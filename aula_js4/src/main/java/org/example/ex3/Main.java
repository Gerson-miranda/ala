package org.example.ex3;

public class Main {
    public static void main(String[] args) {


        cliente c1 = new cliente("João", pedido.Aberto);

        System.out.println("Cliente: " + c1.getNome());
        System.out.println("Status do pedido: " + c1.getPedido().getTexto());
    }

}
