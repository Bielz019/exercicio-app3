package com.SGC.modelos;
package com.SGC.modelos;

public class ContaBancaria {

    // 1️⃣ Atributos
    private String titular;
    private int numeroConta;
    private double saldo;

    // 2️⃣ Construtor vazio
    public ContaBancaria() {
    }

    // 2️⃣ Construtor com parâmetros
    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // 3️⃣ Método específico
    public void depositar(double valor) {
        saldo += valor;
    }

    // 4️⃣ Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // 5️⃣ toString
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}