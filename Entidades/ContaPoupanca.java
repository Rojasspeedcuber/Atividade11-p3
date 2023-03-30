package Entidades;

public class ContaPoupanca extends ContaBancaria {

    private int dia;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(double taxa) {
        saldo += saldo * taxa; 
    }
}
