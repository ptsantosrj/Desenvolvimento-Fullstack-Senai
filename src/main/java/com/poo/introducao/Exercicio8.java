package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio8 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e obtém a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: \n ");
        Double temperaturaEmFahrenheit = scanner.nextDouble();

        // Calcula a media das notas
        Double temperaturaEmCelsius = (temperaturaEmFahrenheit - 32) / 1.8;

        // Exibe o resultado
        System.out.println(temperaturaEmFahrenheit + " oF corresponde a " + temperaturaEmCelsius + " oC");
        
        // Fecha o Scanner100
        scanner.close();
    }
}