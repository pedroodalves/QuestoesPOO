package Lista04.Questao04;

public class Boleto extends Pagamento {

    public Boleto(){}

    @Override
    void processar(double valor){

        double taxa = 2.00;
        double total = valor + taxa;

        System.out.println("Pagamento com Boleto");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa fixa: R$ %.2f%n", taxa);
        System.out.printf("Total: R$ %.2f%n%n", total);
    }
}
