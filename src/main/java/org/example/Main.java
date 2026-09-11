package org.example;

import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int controle = 100;

        do{
            IO.println("Selecione a questão que quer resolver:");
            controle = scanner.nextInt();

            switch(controle) {
                case 1:
                    Questao1.resolverQuestao1();
                    break;
                case 2:
                    Questao2.resolverQuestao2();
                    break;
                case 3:
                    Questao3.resolverQuestao3();
                    break;
                case 4:
                    Questao4.resolverQuestao4();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(controle != 0);
    }
}
