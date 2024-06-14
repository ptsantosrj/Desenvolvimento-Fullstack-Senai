package com.poo.introducao;

//Importando a classe Scanner do pacote java.util, 
//que nos permite ler a entrada do usuário
import java.util.Scanner;

//Declarar o nome da classe.
public class Exercicio1 {

    //public: Um método público é visível em toda a aplicação, mesmo fora do pacote onde a classe que o contém está localizada
    //static: indica que o método pertence à classe em vez de pertencer a uma instância específica da classe. 
    //void: significa que o método não retorna nenhum valor.
    //main: ponto de entrada do programa
    // string[] args:  matriz de strings que permite passar argumentos de linha de comando para o programa quando ele é executado a partir da linha de comando
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita e obtém o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner
        scanner.close();
    }
}
