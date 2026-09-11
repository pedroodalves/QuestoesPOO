package org.example;
import java.util.Scanner;

/*Escreva um programa que leia o nome de um aluno e suas três notas, sendo a terceira nota com peso 2.
Calcule e exiba a média ponderada, com duas casas decimais. Depois, exiba se o aluno está "Aprovado"
(média ≥ 7) ou "Reprovado".*/

public class Questao1 {
    public Questao1(){

    }

    public static void resolverQuestao1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = calcularPonderada(nota1, nota2, nota3);
        System.out.printf("A média do aluno %s é %.2f%n", nomeAluno, media);

        if(aprovacao(media)){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }

    }

    public static double calcularPonderada(double nota1, double nota2, double nota3){

        return (nota1 + nota2 + (nota3 * 2)) / 4;
    }

    public static boolean aprovacao(double media){

        return media >= 7;
    }
}
