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








}
