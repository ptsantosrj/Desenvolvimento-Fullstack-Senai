package com.poo.introducao;

import java.util.Scanner;

public class Lista04 {

    public static double[] vendas = {125.50, 30.11, 50.00, 25.25, 67.35};

    String[] lista = {"Queijo", "Presunto", "Farofa", "Cajuína", "Guaraná Pureza"};
    double[] precos = {10.5, 4.25, 1.5, 10, 4.99};

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


}
