package org.example.expontuada;

public class Endereco {
    private  String logeadouro;
    private  int numero;
    private  String cidade;

    public Endereco(String logeadouro, int numero, String cidade) {
        this.logeadouro = logeadouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogeadouro() {
        return logeadouro;
    }

    public void setLogeadouro(String logeadouro) {
        this.logeadouro = logeadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logeadouro='" + logeadouro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
