package org.example.att2;

public  abstract class Produdo {

    protected String marca;
    protected String modelo;


    public Produdo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Produdo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
