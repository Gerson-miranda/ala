package org.example.att2;

public class Main {

    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("joão", "27/06/2005", Sexo.MASCULINO,Setor.VENDAS, 1500.0, "carteira B");

        Diretor diretor = new Diretor("maria", "11/05/2002", Sexo.FEMININO,Setor.RH,5000.0);


        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());

        diretor.admitir(motoboy);


    }
}
