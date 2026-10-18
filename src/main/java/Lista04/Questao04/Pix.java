package Lista04.Questao04;

public class Pix extends Pagamento {

    public Pix(){}

    @Override
    public void processar(double valor) {
        double desconto = valor * 0.10;
        double total = valor - desconto;

        System.out.println("Pagamento com Pix");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto de 10%%: R$ %.2f%n", desconto);
        System.out.printf("Total: R$ %.2f%n%n", total);
    }
}
