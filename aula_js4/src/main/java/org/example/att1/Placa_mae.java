package org.example.att1;

public abstract class Placa_mae {

    protected String modelo;
    protected String marca;

    public Placa_mae(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Placa_mae{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
