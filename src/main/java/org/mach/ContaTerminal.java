package org.mach;

public class ContaTerminal {

    public void simularConta(int numero, String agencia, String nomeCliente, double saldo) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }

}
