package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    public static void ex1(String[] args) {

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita e obtém o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner
        scanner.close();
    }

    public static void ex2(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o nome
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Solicita e obtém o sobrenome
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Coloca em uma variavel o nome e sobrenome
        String nomesobrenome = nome + " " + sobrenome;

        // Exibe o resultado
        System.out.println("Seja bem vindo: " + nomesobrenome);

        // Fecha o Scanner
        scanner.close();
    } 




}
