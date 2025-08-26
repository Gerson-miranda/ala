package org.example.att1;

public class Memoria extends Placa_mae  {

    private  String capacidade_de_armazenamento;

    public Memoria(String modelo, String marca, String capacidade_de_armazenamento) {
        super(modelo, marca);
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    public String getCapacidade_de_armazenamento() {
        return capacidade_de_armazenamento;
    }

    public void setCapacidade_de_armazenamento(String capacidade_de_armazenamento) {
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidade_de_armazenamento='" + capacidade_de_armazenamento + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
