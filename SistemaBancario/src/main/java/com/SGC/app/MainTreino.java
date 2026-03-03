package main.java.com.sgc.app;

import main.java.com.sgc.modelos.ContaBancaria;

public class MainTreino {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Gabriel", 1, 1000.0);

        System.out.println(conta);

        conta.depositar(500);

        System.out.println("Após depósito:");
        System.out.println(conta);
    }
}