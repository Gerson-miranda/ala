package org.example.atividade1;

public class Principal {
    public static void main(String[] args) {

        Livro l1 = new Livro();
        Livro_2 l2 = new Livro_2();

        l1.Autor = "MAQUIAVEL";
        l1.titulo = "O Príncipe";
        l1.Numero_de_paginas = 160 ;
        l1.Preco = 31;

        l2.Autor ="Robert Greene";
        l2.titulo ="48 leis do poder autor";
        l2.Numero_de_paginas =458;
        l2.Preco =55 ;

        System.out.println("Autor:" + l1.Autor);
        System.out.println("Titulo:" + l1.titulo);
        System.out.println("Numero_de_paginas:" + l1.Numero_de_paginas);
        System.out.println("Preco:" + l1.Preco);

        System.out.println("Autor" + l2.Autor);
        System.out.println("Titulo" + l2.titulo);
        System.out.println("Numero_de_paginas" + l2.Numero_de_paginas);
        System.out.println("Preco" + l2.Preco);
    }
}
