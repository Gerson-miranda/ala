package org.example.ex2;

public class Main {
    public static void main(String[] args) {

        Endereco end = new Endereco("Rua A","12","apt 1","11111111","São Paulo");
        Engenheiro eng = new Engenheiro("João","João.eng@gmail.com",5000.0f,end,"12345");


        Endereco end2 = new Endereco("Rua B","34","apt 2","22222222","Rio de Janeiro");
        Medico med = new Medico("Maria","Maria.med@gmail.com",7000.0f,end2,"Cardiologista");

        System.out.println(eng.toString());
        System.out.println(med.toString());

    }
}
