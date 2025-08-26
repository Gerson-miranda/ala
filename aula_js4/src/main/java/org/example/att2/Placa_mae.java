package org.example.att2;

public class Placa_mae extends Produdo{

    private String soquete;

    public Placa_mae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }


    @Override
    public String toString() {
        return "Placa_mae{" +
                "soquete='" + soquete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
