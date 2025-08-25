package org.example.ex2;

public class Banco {
    private String nome;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private double saldo;
    private String limitedisponivel;

    public Banco(String nome, String agencia, String numeroConta, String tipoConta, double saldo, String limitedisponivel) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limitedisponivel = limitedisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getLimitedisponivel() {
        return limitedisponivel;
    }

    public void setLimitedisponivel(String limitedisponivel) {
        this.limitedisponivel = limitedisponivel;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                ", limitedisponivel='" + limitedisponivel + '\'' +
                '}';
    }
}
