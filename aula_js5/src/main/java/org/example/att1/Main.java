package org.example.att1;

public class Main {

    public static void main(String[] args) {

        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subitracao();
        OperacaoMatematica multiplicar = new Multiplicar();
        OperacaoMatematica divisao = new Divisao();

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtração: " + subtracao.calcular(a, b));
        System.out.println("Multiplicação: " + multiplicar.calcular(a, b));
        System.out.println("Divisão: " + divisao.calcular(a, b));
    }
}
