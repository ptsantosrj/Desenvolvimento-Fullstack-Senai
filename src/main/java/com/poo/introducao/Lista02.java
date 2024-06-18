package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    public static void ex1(String[] args) {

    // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o primeiro número
        System.out.print("Digite o número: ");
        int numerodigitado = scanner.nextInt();

        verificaNumeroPar(numerodigitado);
        scanner.close();

    }

    public static void verificaNumeroPar(int numero) {

        Scanner scanner = new Scanner(System.in);
        int resto = numero % 2;

        if (resto == 0) {
            System.out.print("Par ");
        }else {
            System.out.print("Impar ");
        }
        scanner.close();

    }








}

