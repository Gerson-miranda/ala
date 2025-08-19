package org.example.ex3;

public class Livro {

    private   String titulo;
    private   String autor;
    private   int numero_de_paginas;
    private   double valor_De_compra;

    //Construtor

    public Livro(String titulo, String autor, int numero_de_paginas, double valor_De_compra) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
        this.valor_De_compra = valor_De_compra;
    }


    // metodos getters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public double getValor_De_compra() {
        return valor_De_compra;
    }

    public void setValor_De_compra(double valor_De_compra) {
        this.valor_De_compra = valor_De_compra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero_de_paginas=" + numero_de_paginas +
                ", valor_De_compra=" + valor_De_compra +
                '}';
    }
}
