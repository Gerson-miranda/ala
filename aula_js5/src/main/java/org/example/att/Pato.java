package org.example.att;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Quack Quack";
    }

    @Override
    public String comer() {
        return "O pato está comendo.";
    }
}
