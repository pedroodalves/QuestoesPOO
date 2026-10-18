package Lista04.Questao04;

import java.util.Scanner;

public class CartaoDeCredito extends Pagamento {

    public CartaoDeCredito(){

    }

    @Override
    void processar(double valor){

        if(valor <= 0){
            System.out.println("Valor inválido!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe em quantas vezes você deseja dividir a compra: ");
        System.out.println("Você pode dividir em até 10 vezes!");
        int prestacoes = scanner.nextInt();

        double valorPrestacao = valor / prestacoes;
        System.out.println("O valor da prestação é de R$" + valorPrestacao);
    }
}
