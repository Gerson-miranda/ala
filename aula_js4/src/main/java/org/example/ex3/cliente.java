package org.example.ex3;

public class cliente {
    private String nome;
    private pedido pedido;

    public cliente(String nome, org.example.ex3.pedido pedido) {
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public org.example.ex3.pedido getPedido() {
        return pedido;
    }

    public void setPedido(org.example.ex3.pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
