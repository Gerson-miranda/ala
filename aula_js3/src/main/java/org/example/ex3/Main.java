package org.example.ex3;

public class Main {
    public static void main(String[] args) {



        Veiculo v1 = new Veiculo("ABC1D23","Prata",5,190,55,12);

        Livro l1 = new Livro("A Sombra do Vento","Carlos Ruiz Zafón",480,39.90);

        Cliente c1 = new Cliente("Mariana Oliveira Santos",29,123.456,"Rua das Flores",91234-5678);
        System.out.println(v1.toString());
        System.out.println(l1.toString());
        System.out.println(c1);
    }

}
