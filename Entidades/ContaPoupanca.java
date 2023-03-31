package Entidades;

public class ContaPoupanca extends ContaBancaria {


    public ContaPoupanca(int numero, String nome) {
        super(numero, nome);
    }

    public void atualiza(double taxa) {
        saldo += saldo * taxa; 
    }


}
