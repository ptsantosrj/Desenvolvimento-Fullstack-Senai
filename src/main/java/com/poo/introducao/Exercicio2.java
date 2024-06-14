package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;


public class Exercicio2 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
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
