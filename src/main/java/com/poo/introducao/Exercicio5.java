package com.poo.introducao;

import java.math.BigDecimal;
import java.math.RoundingMode;
//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar a classe SomaNumeros.
public class Exercicio5 {
    //Declarar o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {

        double larguraTerreno;
        double comprimentoTerreno;
        double area;
        double valorDoM2;
        double valorTerreno;

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a largura do terreno
        System.out.print("Digite a largura do terreno: \n");
        larguraTerreno = scanner.nextDouble();

        // Solicita e obtém o comprimento do terreno
        System.out.print("Digite o comprimento do terreno: \n");
        comprimentoTerreno = scanner.nextDouble();

        // Solicita e obtém o valor do m2
        System.out.print("Digite o valor do m2 em reais: \n");
        valorDoM2 = scanner.nextDouble();

        // Calculando a area do terreno
        area = larguraTerreno * comprimentoTerreno;

        // Calculando o valor do terreno
        valorTerreno = valorDoM2 * area;

        // Arredonda o valor para ate 2 casas decimais
        // BigDecimal class fornece operações em números duplos para aritmética, manipulação de escala, arredondamento, comparação, conversão de formato e hashing.
        // HALF_EVEN indica que o arredondamento acontece para o valor mais próximo
        BigDecimal bd = new BigDecimal(valorTerreno).setScale(3, RoundingMode.HALF_EVEN);
        
        // Exibe o resultado
        System.out.println("O valor do terreno é: R$ " + bd.doubleValue());

        // Fecha o Scanner
        scanner.close();
    }
}
