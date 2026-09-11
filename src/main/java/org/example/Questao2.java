package org.example;

/*Peça um número ao usuário. Verifique e imprima:
"Múltiplo de 3", se for múltiplo de 3;
"Múltiplo de 5", se for múltiplo de 5;
"Múltiplo de ambos", se for múltiplo de 3 e 5;
"Não é múltiplo de 3 nem de 5", caso contrário.
*/

import java.util.Scanner;

public class Questao2 {
    public Questao2(){

    }

    public static void resolverQuestao2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = scanner.nextInt();

        if(multiploAmbos(num)){
            System.out.println("Múltiplo de ambos");
            return;
        }
        else if(multiploTres(num)){
            System.out.println("Múltiplo de 3");
            return;
        }
        else if(multiploCinco(num)){
            System.out.println("Múltiplo de 5");
            return;
        }

        System.out.println("O número informado não é múltiplo de 3 nem de 5.");
    }

    public static boolean multiploTres(int num){

        return num % 3 == 0;
    }

    public static boolean multiploCinco(int num){

        return num % 5 == 0;
    }

    public static boolean multiploAmbos(int num){

        return multiploTres(num) && multiploCinco(num);
    }
}
