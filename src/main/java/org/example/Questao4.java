package org.example;
import java.util.Scanner;

/*Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido,
seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa
lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler os cinco números
*/

public class Questao4 {

    public Questao4(){

    }

    public static void resolverQuestao4(){

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int numero;

        System.out.println("Informe cinco números:");

        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o %do número: %n", i + 1);
            numero = scanner.nextInt();
            vetor[i] = limitarNumero(numero);
        }

        imprimirAsteriscos(vetor);
    }

    public static void imprimirAsteriscos(int vetor[]){

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i]; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static int limitarNumero(int num){

        if(num > 30){
            num = 30;
        }
        else if(num < 0){
            num = 0;
        }

        return num;
    }
}

