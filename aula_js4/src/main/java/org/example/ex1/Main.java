package org.example.ex1;

public class Main {
    public static void main(String[] args) {

        Pet p1 = new Pet("Thor",3,"Golden Retriever");
        Cliente c1 = new Cliente("João",23,p1);


        System.out.println(c1.toString());
    }
}
