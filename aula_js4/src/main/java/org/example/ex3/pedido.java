package org.example.ex3;

public enum pedido {

    Aberto ("Aberto"),
    CANCELADO ("CANCELADO"),
    CONCLUIDO ("CONCLUIDO");

    private String texto;

    private pedido(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
