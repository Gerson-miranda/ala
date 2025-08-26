package org.example.att2;

public class Main {

    public static void main(String[] args) {

        Processador processador = new Processador("Intel i7", "3.6", "8");

        Memoria memoria = new Memoria("Kingston", "16GB", "3200MHz");

        Placa_mae placa_mae = new Placa_mae("ASUS", "ROG STRIX", "ATX");

        Dispositivo_de_Armazenamento armazenamento = new Dispositivo_de_Armazenamento("Samsung", "1TB");


        System.out.println(processador.toString());
        System.out.println(memoria.toString());
        System.out.println(placa_mae.toString());
        System.out.println(armazenamento.toString());
    }
}
