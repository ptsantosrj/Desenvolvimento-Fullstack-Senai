package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio4 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o número
        System.out.print("Digite o número: ");
        int numero1 = scanner.nextInt();

        // Calcular o antecessor e sucessor
        int antecessor = numero1 - 1;
        int sucessor = numero1 + 1;

        // Exibe o resultado
        System.out.println("O antecessor do numero " + numero1 + " é: " + antecessor + " e seu sucessor é: " + sucessor);

        // Fecha o Scanner
        scanner.close();
    }
}
