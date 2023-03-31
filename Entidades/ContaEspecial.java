package Entidades;

public class ContaEspecial extends ContaBancaria {

    private double limite = 500;

    public ContaEspecial(int numero, String nome) {
        super(numero, nome);
    }
    
    @Override
    public void sacar(int numero, double quantia) {
        if (numero == this.numero) {
            saldo -= quantia;      
            if (saldo < limite){
                saldo = limite;
                System.out.println("Sua conta está com saldo negativo, e não pode ultrapassar o limite de dívida.");
            }
            
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

}
