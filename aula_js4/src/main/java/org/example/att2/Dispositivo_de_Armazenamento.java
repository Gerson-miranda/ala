package org.example.att2;

public class Dispositivo_de_Armazenamento {

    private  String capacidade_de_armazenamento;

    private  String tipo_de_conexao;

    public Dispositivo_de_Armazenamento(String capacidade_de_armazenamento, String tipo_de_conexao) {
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
        this.tipo_de_conexao = tipo_de_conexao;
    }

    public String getCapacidade_de_armazenamento() {
        return capacidade_de_armazenamento;
    }

    public void setCapacidade_de_armazenamento(String capacidade_de_armazenamento) {
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }

    public String getTipo_de_conexao() {
        return tipo_de_conexao;
    }

    public void setTipo_de_conexao(String tipo_de_conexao) {
        this.tipo_de_conexao = tipo_de_conexao;
    }

    @Override
    public String toString() {
        return "Dispositivo_de_Armazenamento{" +
                "capacidade_de_armazenamento='" + capacidade_de_armazenamento + '\'' +
                ", tipo_de_conexao='" + tipo_de_conexao + '\'' +
                '}';
    }
}
