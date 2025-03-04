package org.mach.desafios.controlefluxo;

import org.mach.desafios.controlefluxo.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int n2 = sc.nextInt();

        try {
            count(n1, n2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void count(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");

        int contagem = n2 - n1;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (n1 + i));
        }
    }
}
