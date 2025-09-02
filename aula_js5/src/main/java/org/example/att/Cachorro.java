package org.example.att;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au au";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
