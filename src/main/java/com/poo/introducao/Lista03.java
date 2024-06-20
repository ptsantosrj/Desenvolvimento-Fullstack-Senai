package com.poo.introducao;

import java.util.Scanner;

public class Lista03 {

    public static void ex1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int segundos = 0;

        while (true) {
            System.out.print("Digite o número de segundos (1 a 59): ");
            
            if (scanner.hasNextInt()) {
                segundos = scanner.nextInt();
                
                if (segundos >= 1 && segundos <= 59) {
                    break; // sai do loop se o valor estiver correto
                } else {
                    System.out.println("Número inválido! Digite um número entre 1 e 59.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next(); // limpar o buffer de entrada
            }
        }

        System.out.println("\nIniciando cronômetro...");

        try {
            for (int i = segundos; i >= 0; i--) {
                System.out.printf("\rTempo restante: %02d segundos", i);
                Thread.sleep(1000); // pausa de 1 segundo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nCronômetro finalizado.");
        scanner.close();

    }


}
