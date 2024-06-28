package com.poo.introducao;

import java.util.HashSet;
import java.util.Scanner;

public class Lista04 {

    static double[] vendas = {125.50, 30.11, 50.00, 25.25, 67.35};

    static String[] lista = {"Queijo", "Presunto", "Farofa", "Cajuína", "Guaraná Pureza"};
    static double[] precos = {10.5, 4.25, 1.5, 10, 4.99};

    static double ex1() {
        // Fechamento do dia do mercado
        double total = somaDoDia(vendas);

        System.out.println("O fechamento do dia é: R$" + String.format("%.2f",total));

        return total;
    }
    static double somaDoDia(double[] lista){
        double resultado = 0;

        // Opção 1
        for (int i=0; i<= (lista.length-1); i++){
            resultado = resultado + lista[i];
        }
        // Opção 2
        // for(double item : lista){
        //     resultado = resultado + item;
        // }

        return resultado;
    }

    static void ex2() {
        // Identificar a de menor e maior valor
        
        System.out.println("A maior venda foi: R$" + identificaNumeroMaior(vendas));
        System.out.println("A menor venda foi: R$" + identificaNumeroMenor(vendas));
    }
    static double identificaNumeroMaior(double[] lista){
        double numeroMaior = 0;
        for(double item : lista) {
            if(item > numeroMaior) {
                numeroMaior = item;
            }
        }
        return numeroMaior;
    }
    static double identificaNumeroMenor(double[] lista){
        double numeroMenor = 0;
        for(double item : lista) {
            if(item < numeroMenor) {
                numeroMenor = item;
            }
        }
        return numeroMenor;
    }

    static void ex3() {
        // Ticket médio
        // Total das vendas / Quantidade de vendas
        // ex1 / vendas.lenght
        double ticketMedio;
        ticketMedio = ex1()/vendas.length;

        System.out.println("O ticket médio é: R$" + String.format("%.2f",ticketMedio)) ;
    }

    static void ex4() {
        // Número pares da lista

        int[] lista = {3,5,6,7,8,10,22,55,110};

        for(int num : lista) {
            if( (num%2) == 0 ){
                System.out.print(num + " ");
            }
        }
    }

    static void ex5() {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        HashSet<String> mercado = new HashSet<String>();

        mercado.add("pão");
        mercado.add("leite");
        mercado.add("manteiga");

        while(true){
        System.out.println("-- MENU --");
        System.out.println("1. Ver lista");
        System.out.println("2. Adicionar item");
        System.out.println("3. Sair");
        System.out.println("Pressione o número da opção desejada.");
        int resposta = sc.nextInt();

        if(resposta == 1){
            System.out.println(mercado);

        }else if (resposta ==2){
            System.out.println("Adicione um item: ");
            String item = scs.next();
            mercado.add(item);
            System.out.println("Sua lista de mercado agora é: " + mercado);

        }else if (resposta ==3){
            System.out.println("Saindo...");
            break;

        }else{
            System.out.println("Digite um número válido");
        }
        }   
    }


    









}
