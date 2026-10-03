package Lista02;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da nova conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o nome do titular:");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int controle = 100;

        do{
            System.out.println("Selecione a ação dentre as opções abaixo:");
            System.out.println("Pressione 1 para sacar.");
            System.out.println("Pressione 2 para depositar.");
            System.out.println("Pressione 3 para ver o saldo");
            System.out.println("Pressione 0 para encerrar.");
            controle = scanner.nextInt();

            switch(controle) {
                case 1:
                    System.out.println("Informe o valor que deseja sacar: ");
                    double valorSaque = scanner.nextFloat();
                    if(conta.sacar(valorSaque)){
                        System.out.println("Saque concluído com sucesso!");
                    };
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextFloat();
                    if(conta.depositar(valorDeposito)){
                        System.out.println("Depósito concluído com sucesso!");
                    };
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
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
