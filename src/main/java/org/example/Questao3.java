package org.example;

/*Peça ao usuário um número inteiro positivo N. Em seguida, imprima todos os números primos entre 2 e N.*/

import java.util.Scanner;

public class Questao3 {
    public Questao3(){

    }

    public static void resolverQuestao3(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = scanner.nextInt();
        if(num <= 2){
            System.out.println("Número inválido!");
            return;
        }
        imprimirPrimos(num);
    }

    public static void imprimirPrimos(int num){

        for(int i = 2; i < num; i++){
            if(ehPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean ehPrimo(int num){

        int divisores = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divisores++;
            }

        }
        return divisores == 2;
    }
}
