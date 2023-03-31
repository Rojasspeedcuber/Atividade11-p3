package Entidades;

public class ContaPoupanca extends ContaBancaria {


    public ContaPoupanca(int numero, String nome) {
        super(numero, nome);
    }

    public void atualiza(double taxa) {
        saldo += saldo * taxa; 
    }

    public double getSaldo(int numero) {
        if (numero == this.numero) {
            return saldo;
        }
        return -1.0;
    }

    public void depositar(int numero, double quantia) {
        if (numero == this.numero) {
            saldo += quantia;
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(int numero, double quantia) {
        if (numero == this.numero && quantia < saldo) {
            toString();
            saldo -= quantia;
        } else {
            System.out.println("Conta não encontrada ou saldo insuficiente.");
        }
    }

}
