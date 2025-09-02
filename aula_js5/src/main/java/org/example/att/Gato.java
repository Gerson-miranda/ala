package org.example.att;

public class Gato implements Animal{

    @Override
    public String emitirSom() {
        return "Miau miau";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
