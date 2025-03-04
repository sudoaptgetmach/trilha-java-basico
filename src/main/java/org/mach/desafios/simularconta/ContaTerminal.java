package org.mach.desafios.simularconta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Insira a agência: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira o saldo do conta: ");
        double saldo = sc.nextDouble();

        simularConta(numero, agencia, nomeCliente, saldo);
    }

    public static void simularConta(int numero, String agencia, String nomeCliente, double saldo) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
