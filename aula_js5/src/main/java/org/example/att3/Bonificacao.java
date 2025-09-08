package org.example.att3;

public enum Bonificacao {

    GERENTE(1.3),
    DIRETOR(1.4);

    private double taxa;

    Bonificacao(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }


}
