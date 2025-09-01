package org.example.polimorfismo;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(gato.emitirSom());
        System.out.println(cachorro.emitirSom());

    }
}
