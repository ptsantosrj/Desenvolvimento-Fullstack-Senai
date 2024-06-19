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


    public static void ex2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numeroDigitado2 = scanner.nextInt();

        verificaNumeroMaior(numeroDigitado1, numeroDigitado2);
        scanner.close();
    }
    public static void verificaNumeroMaior(int numero1, int numero2) {

        if(numero1 > numero2){
            System.out.print("O número " + numero1 + " é maior que " + numero2);
        } else if(numero1 == numero2){
            System.out.print("O número " + numero1 + " é igual ao número " + numero2);
        } else {
            System.out.print("O número " + numero1 + " é menor que " + numero2);
        }
       
    }
    
    public static void ex3(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo, voce tem mais que 65 anos? s ou n ");
        String resposta1 = scanner.nextLine();

        if(resposta1.equals ("s")){
            System.out.print("Siga para a fila preferencial");
        } else {
            System.out.print("Voce possui alguma deficiencia? s ou n");
            String resposta2 = scanner.nextLine();

            if(resposta2.equals ("s")){
                System.out.print("Siga para a fila preferencial");
            } else {
                System.out.print("Voce é gestante? s ou n");
                String resposta3 = scanner.nextLine();

                if(resposta3.equals ("s")){
                    System.out.print("Siga para a fila preferencial");
                } else {
                    System.out.print("Siga para a fila comum");
                }
            }
            scanner.close();
        }
    }

    public static void ex4 (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.print("Entrada liberada ");
        } else if (idade < 18 && idade >=16){
            System.out.print("Somente acompanhado de um adulto ");
        } else{
            System.out.print("Você não pode entrar ");

        }

        scanner.close();

    }

    public static void ex5(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String loginDigitado = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        verificaCredencial(loginDigitado, senhaDigitada);
        scanner.close();
        
    }
    public static void verificaCredencial(String loginDigitado, String senhaDigitada) {
        final String login = "Patrick";
        final String senha = "123456";

        if(loginDigitado.equals(login) && senhaDigitada.equals(senha)){
            System.out.print("Bem vindo, " + login);
        } else {
            if(!loginDigitado .equals(login) && !senhaDigitada.equals(senha)){
                System.out.print("Login e senha errados!");
            } else if (!senhaDigitada.equals(senha)){
                System.out.print("Senha errada!");
            } else {
                System.out.print("Login errado!");
            }
        }
    }




}

