package org.example.ex2;

public class Main {
    public static void main(String[] args) {

        Banco b1 = new Banco("Banco do Brasil", "1234", "56789-0", "Conta Corrente", 1000.0, "100.0");
        Funcionairo f1 = new Funcionairo(1, "João Silva", "Rua A, 123", "99999-9999", "sal@gmai.com", b1);


        System.out.println(f1.toString());
    }
}
