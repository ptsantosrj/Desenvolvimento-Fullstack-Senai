package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    public static void ex1(String[] args) {

    // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o primeiro número
        System.out.print("Digite o número: ");
        int numerodigitado = scanner.nextInt();

        verificaNumeroPar(numerodigitado);
        scanner.close();

    }
    public static void verificaNumeroPar(int numero) {

        Scanner scanner = new Scanner(System.in);
        int resto = numero % 2;

        if (resto == 0) {
            System.out.print("Par ");
        }else {
            System.out.print("Impar ");
        }
        scanner.close();

    }


    public static void ex2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numeroDigitado2 = scanner.nextInt();

        verificaNumeroMaior(numeroDigitado1, numeroDigitado2);
        scanner.close();
    }
    public static void verificaNumeroMaior(int numero1, int numero2) {

        if(numero1 > numero2){
            System.out.print("O número " + numero1 + " é maior que " + numero2);
        } else if(numero1 == numero2){
            System.out.print("O número " + numero1 + " é igual ao número " + numero2);
        } else {
            System.out.print("O número " + numero1 + " é menor que " + numero2);
        }
       
    }
    
    public static void ex3(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo, voce tem mais que 65 anos? s ou n ");
        String resposta1 = scanner.nextLine();

        if(resposta1.equals ("s")){
            System.out.print("Siga para a fila preferencial");
        } else {
            System.out.print("Voce possui alguma deficiencia? s ou n");
            String resposta2 = scanner.nextLine();

            if(resposta2.equals ("s")){
                System.out.print("Siga para a fila preferencial");
            } else {
                System.out.print("Voce é gestante? s ou n");
                String resposta3 = scanner.nextLine();

                if(resposta3.equals ("s")){
                    System.out.print("Siga para a fila preferencial");
                } else {
                    System.out.print("Siga para a fila comum");
                }
            }
            scanner.close();
        }
    }

    public static void ex4 (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.print("Entrada liberada ");
        } else if (idade < 18 && idade >=16){
            System.out.print("Somente acompanhado de um adulto ");
        } else{
            System.out.print("Você não pode entrar ");

        }

        scanner.close();

    }

    public static void ex5(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String loginDigitado = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        verificaCredencial(loginDigitado, senhaDigitada);
        scanner.close();
        
    }
    public static void verificaCredencial(String loginDigitado, String senhaDigitada) {
        final String login = "Patrick";
        final String senha = "123456";

        if(loginDigitado.equals(login) && senhaDigitada.equals(senha)){
            System.out.print("Bem vindo, " + login);
        } else {
            if(!loginDigitado .equals(login) && !senhaDigitada.equals(senha)){
                System.out.print("Login e senha errados!");
            } else if (!senhaDigitada.equals(senha)){
                System.out.print("Senha errada!");
            } else {
                System.out.print("Login errado!");
            }
        }
    }

    public static void ex6(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("1ª Nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("2ª Nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Parabéns, você foi aprovado! Média: " + media);
        } else {
            System.out.print("Média: " + media + " Nota de recuperação: ");
            double recuperacao = scanner.nextDouble();

            if ((nota1 > nota2) && (recuperacao > nota2)) {
                media = (nota1 + recuperacao) / 2;
            } else if ((nota2 > nota1) && (recuperacao > nota1)) {
                media = (nota2 + recuperacao) / 2;
            }

            if (media >= 6) {
                System.out.println("Parabéns, você foi aprovado! Média: " + media);
            } else {
                System.out.println("Reprovado! Média: " + media);
            }
        }

        scanner.close();
    }

    public static void ex7(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividendo, divisor;
        double resto, resultado;

        System.out.print("Insira um número para dividirmos: ");
        dividendo = scanner.nextInt();

        System.out.print("Insira o divisor: ");
        divisor = scanner.nextInt();

        resto = dividendo % divisor;
        resultado = (double) dividendo / divisor; // Cast para garantir a divisão real

        if (resto == 0) {
            System.out.println(dividendo + " é divisível por " + divisor);
        } else {
            System.out.println("Não é possível dividir " + dividendo + " por " + divisor + ". O resultado seria: " + resultado);
        }

        scanner.close();
    }

    public static void ex8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chances = 3; 

        // Primeira pergunta
        System.out.println("Quem descobriu o Brasil?");
        System.out.println("1) Pedro Vieira");
        System.out.println("2) Pedro Álvares Cabral");
        System.out.println("3) Pedro Santos");
        int resposta1 = scanner.nextInt();

        if (resposta1 != 2) {
            chances--;
        }

        // Segunda pergunta
        System.out.println("Que time conquistou a Libertadores de 2000?");
        System.out.println("1) Flamengo");
        System.out.println("2) Vasco");
        System.out.println("3) Nenhuma das anteriores");
        int resposta2 = scanner.nextInt();

        if (resposta2 != 2) {
            chances--;
        }

        // Terceira pergunta
        System.out.println("Qual o maior artilheiro do Brasileirão de todos os tempos?");
        System.out.println("1) Zico");
        System.out.println("2) Roberto Dinamite");
        System.out.println("3) Nenhuma das anteriores");
        int resposta3 = scanner.nextInt();

        if (resposta3 != 2) {
            chances--;
        }

        // Quarta pergunta
        System.out.println("Quais são as cores primárias?");
        System.out.println("1) Azul, verde e roxo");
        System.out.println("2) Azul, vermelho e amarelo");
        System.out.println("3) Nenhuma das anteriores");
        int resposta4 = scanner.nextInt();

        if (resposta4 != 2) {
            chances--;
        }

        // Verificação final
        if (chances == 0) {
            System.out.println("Você perdeu!");
        } else {
            // Quinta pergunta
            System.out.println("Quem foi a primeira pessoa a pisar na lua?");
            System.out.println("1) Yuri Gagarin");
            System.out.println("2) Neil Armstrong");
            System.out.println("3) Nenhuma das anteriores");
            int resposta5 = scanner.nextInt();

            // Verifica se errou a última pergunta
            if (resposta5 != 2) {
                chances--;
            }

            // Verifica se ainda tem chances ou perdeu
            if (chances == 0) {
                System.out.println("Você perdeu!");
            } else {
                System.out.println("Parabéns! Você acertou todas as perguntas!");
            }
        }

        scanner.close();
    }


}

