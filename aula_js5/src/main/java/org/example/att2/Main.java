package org.example.att2;

public class Main {

    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("joão", "12345678900", Sexo.MASCULINO,Setor.VENDAS, 1500.0, "carteir B");

        Diretor diretor = new Diretor("maria", "98765432100", Sexo.FEMININO,Setor.RH,5000.0, 12345.0);


        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());




    }
}
