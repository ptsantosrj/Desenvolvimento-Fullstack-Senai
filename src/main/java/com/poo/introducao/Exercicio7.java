package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio7 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e obtém a nota 1
        System.out.print("Digite a primeira nota: \n ");
        int nota1 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a segunda nota: \n ");
        int nota2 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a terceira nota: \n ");
        int nota3 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a quarta nota: \n ");
        int nota4 = scanner.nextInt();
        
        // Calcula a media das notas
        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe o resultado
        System.out.println("O media das notas é: $" + media);
        
        // System.out.println("O valor em dolar é: $" + Math.round(valorConvertidoParaDolar));
        // Fecha o Scanner100
        scanner.close();
    }
}
