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

    public static void ex2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Entrada inválida! Digite um número inteiro.");
        }
        
        scanner.close();


    }

    public static void ex3(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("\nNúmeros pares entre " + menor + " e  " + maior + ":");

        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void ex4(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo da adivinhação!");
        System.out.print("Peça alguem para escolher um número inteiro entre 1 e 100: ");
        int numeroSecreto = scanner.nextInt();

        System.out.println("\nPeça para alguem tentar adivinhar!");

        boolean acertou = false;
        int tentativas = 0;

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                acertou = true;
            }

            // Dica adicional
            if (!acertou) {
                if (Math.abs(numeroSecreto - palpite) <= 5) {
                    System.out.println("Está quase lá!");
                } else {
                    System.out.println("Tá longe!");
                }
            }
        }

        System.out.println("\nParabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
        scanner.close();

    }
        
    public static void ex5(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "patrick";
        String senhaCorreta = "12345";

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {

            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido! Bem-vindo, " + login + ".");
                break;
            } else {
                tentativasRestantes--;

                if (tentativasRestantes > 0) {
                    System.out.println("Credenciais incorretas! Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Última tentativa! Mais um erro e seu acesso será bloqueado!");
                }
            }
        }

        if (tentativasRestantes == 0) {
            System.out.println("Acesso bloqueado! Entre em contato com o suporte.");
        }

        scanner.close();

    }

    public static void ex6(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de andares da pirâmide: ");
        int numeroAltura = scanner.nextInt();

        // Loop para desenhar cada andar da pirâmide
        for (int i = 1; i <= numeroAltura; i++) {
            // Espaços em branco à esquerda para centralizar a pirâmide
            for (int j = 1; j <= numeroAltura - i; j++) {
                System.out.print(" ");
            }
            
            // Asteriscos para formar os andares da pirâmide
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Quebra de linha após cada andar
            System.out.println();
        }

        scanner.close();

    }

    
}