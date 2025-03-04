package org.mach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
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

        conta.simularConta(numero, agencia, nomeCliente, saldo);
    }
}