package Lista02;

public class ContaCorrente {

    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String titular){

        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean validarOperacao(double valor, String operacao){

        if(operacao == "Saque") {
            return valor <= this.saldo && valor <= 10000;
        }
        else if(operacao == "Depósito"){
            return valor > 0 && valor <= 10000;
        }

        System.out.println("Operação inválida!");
        return false;
    }

    public boolean sacar(double valor){

        if(validarOperacao(valor, "Saque")) {
            double saldoAtual = this.saldo;
            setSaldo(saldoAtual - valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean depositar(double valor){

        if(validarOperacao(valor, "Depósito")){
            double saldoAtual = this.saldo;
            setSaldo(saldoAtual + valor);
            return true;
        }
        System.out.println("Valor inválido!");
        return false;
    }

    public double consultarSaldo(){
        return getSaldo();
    }
}
