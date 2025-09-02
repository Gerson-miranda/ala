package org.example.att;

public class Main {
    public static void main(String[] args) {

        Cachorro  cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("Gato:"+gato.emitirSom() +"come:" + gato.comer());
        System.out.println("Dog:"+cachorro.emitirSom() + "come: " + cachorro.comer());
        System.out.println("Galo:"+galo.emitirSom() + "come: " + galo.comer());
        System.out.println("Pato:"+pato.emitirSom()  + "come: " + pato.comer());

    }
}
