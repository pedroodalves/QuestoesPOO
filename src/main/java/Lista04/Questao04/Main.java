package Lista04.Questao04;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CartaoDeCredito(),
                new Boleto(),
                new Pix()
        };

        double valor = 100.00;

        for (Pagamento pagamento : pagamentos) {
            pagamento.processar(valor);
        }
    }
}

