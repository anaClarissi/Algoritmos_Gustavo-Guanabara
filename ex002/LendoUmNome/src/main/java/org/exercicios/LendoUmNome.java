package org.exercicios;

import java.util.Scanner;

public class LendoUmNome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.printf("Olá %s, é um prazer te conhecer!", nomeDoUsuario);

    }

}
