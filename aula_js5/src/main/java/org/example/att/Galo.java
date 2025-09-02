package org.example.att;

public class Galo implements Animal{

    @Override
    public String emitirSom() {
        return "cocoricó";
    }

    @Override
    public String comer() {
        return "milho";
    }
}
