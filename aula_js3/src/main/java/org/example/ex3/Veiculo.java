package org.example.ex3;

public class Veiculo {

    private String placa;
    private String cor;
    private int numero_de_passageiros;
    private int velocidaed_maxima;
    private double capacidade_de_tanque;
    private double consumo_medio;

    //Construtor

    public Veiculo(String placa, String cor, int numero_de_passageiros, int velocidaed_maxima, double capacidade_de_tanque, double consumo_medio) {
        this.placa = placa;
        this.cor = cor;
        this.numero_de_passageiros = numero_de_passageiros;
        this.velocidaed_maxima = velocidaed_maxima;
        this.capacidade_de_tanque = capacidade_de_tanque;
        this.consumo_medio = consumo_medio;
    }

    // metodos getters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_de_passageiros() {
        return numero_de_passageiros;
    }

    public void setNumero_de_passageiros(int numero_de_passageiros) {
        this.numero_de_passageiros = numero_de_passageiros;
    }

    public int getVelocidaed_maxima() {
        return velocidaed_maxima;
    }

    public void setVelocidaed_maxima(int velocidaed_maxima) {
        this.velocidaed_maxima = velocidaed_maxima;
    }

    public double getCapacidade_de_tanque() {
        return capacidade_de_tanque;
    }

    public void setCapacidade_de_tanque(double capacidade_de_tanque) {
        this.capacidade_de_tanque = capacidade_de_tanque;
    }

    public double getConsumo_medio() {
        return consumo_medio;
    }

    public void setConsumo_medio(double consumo_medio) {
        this.consumo_medio = consumo_medio;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numero_de_passageiros=" + numero_de_passageiros +
                ", velocidaed_maxima=" + velocidaed_maxima +
                ", capacidade_de_tanque=" + capacidade_de_tanque +
                ", consumo_medio=" + consumo_medio +
                '}';
    }
}
