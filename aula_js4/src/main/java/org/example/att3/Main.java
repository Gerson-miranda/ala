package org.example.att3;

public class Main {


    public static void main(String[] args) {


        Camisa c1 = new Camisa("Nike", "Preta", "M", 150.0);
        Calca calca1 = new Calca("Adidas", "Azul", "42", 200.0);
        Sapato s1 = new Sapato("Puma", "Branco", "40", 250.0);

        System.out.println(c1.toString());
        System.out.println(calca1.toString());
        System.out.println(s1.toString());
    }
}
