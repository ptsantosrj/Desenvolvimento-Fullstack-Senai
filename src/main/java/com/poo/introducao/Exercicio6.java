package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio6 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {

        double distanciaKM;
        double consumoL;
        double custoL = 5.00;

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a distancia percorrida em km
        System.out.print("Digite a distancia percorrida em KM: \n");
        distanciaKM = scanner.nextDouble();

        // Solicita e obtém o gasto de combustivel em Litros
        System.out.print("Digite o total gasto em combustivel em L: \n");
        consumoL = scanner.nextDouble();

        System.out.print("Sua autonomia foi de: " + ( distanciaKM/(consumoL/custoL) ) + " Km/L.");

        // Fecha o Scanner
        scanner.close();
    }
}