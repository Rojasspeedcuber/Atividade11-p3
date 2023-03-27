package Entidades;

public class ContaBancaria {

    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numero da conta: " + numero + ", nome: " + nome + '}';
    }

    public void depositar(int numero, double quantia) {
        if (numero == this.numero) {
            toString();
            saldo += quantia;
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(int numero, double quantia) {
        if (numero == this.numero && quantia < saldo) {
            toString();
            saldo += quantia;
        } else {
            System.out.println("Conta não encontrada ou saldo insuficiente.");
        }
    }

    public double getSaldo(int numero) {
        if (numero == this.numero) {
            return saldo;
        }
        return -1.0;
    }

}
