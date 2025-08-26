package org.example.att1;

public class Main {
    public static void main(String[] args) {

    Processador processador = new Processador("Ryzen 5 5600X", "AMD", "3.7 GHz");

    Memoria memoria = new Memoria("Corsair Vengeance LPX", "Corsair", "16GB");

        System.out.println(processador.toString());
        System.out.println(memoria.toString());

    }
}
