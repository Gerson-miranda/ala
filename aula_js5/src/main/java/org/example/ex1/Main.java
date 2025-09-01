package org.example.ex1;

public class Main {
    public static void main(String[] args) {

        Fisica f1 = new Fisica("Jaão","99999-9999","111.111.111-11","11.111.111-1","01/01/2000");
        Juridica j1 = new Juridica("Empresa X","88888-8888","11.111.111/0001-11","12345678");

        System.out.println(f1.toString());
        System.out.println(j1.toString());
    }
}
