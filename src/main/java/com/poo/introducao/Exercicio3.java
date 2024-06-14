package com.poo.introducao;

import java.math.BigDecimal;
import java.math.RoundingMode;
//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio3 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o valor em reais
        System.out.print("Digite um valor em reais para converter em dolar: \n ");
        double valorDigitadoEmReais = scanner.nextDouble();

        // Solicita e obtém a taxa de conversao
        System.out.print("Digite o valor da taxa de conversao: \n ");
        double TaxaConversao = scanner.nextDouble();
        
        // Calcula a divisao dos dois valores
        double valorConvertidoParaDolar = valorDigitadoEmReais / TaxaConversao;

        // Arredonda o valor para ate 2 casas decimais
        // BigDecimal class fornece operações em números duplos para aritmética, manipulação de escala, arredondamento, comparação, conversão de formato e hashing.
        // HALF_EVEN indica que o arredondamento acontece para o valor mais próximo
        BigDecimal bd = new BigDecimal(valorConvertidoParaDolar).setScale(2, RoundingMode.HALF_EVEN);
        
        // Exibe o resultado
        System.out.println("O valor em dolar é: $" + bd.doubleValue());

        
        // System.out.println("O valor em dolar é: $" + Math.round(valorConvertidoParaDolar));
        // Fecha o Scanner100
        scanner.close();
    }
}
