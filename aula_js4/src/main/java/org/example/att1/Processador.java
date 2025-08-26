package org.example.att1;

public  class Processador extends Placa_mae {
    private String frequencia;

    public Processador(String modelo, String marca, String frequencia) {
        super(modelo, marca);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }


    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
