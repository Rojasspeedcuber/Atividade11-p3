
package banco;

import Entidades.ContaBancaria;
import java.util.Random;
import java.util.Scanner;

public class Banco {

    public static void exibeOpcoes(){
        System.out.println("Menu de opções: ");
        System.out.println("0 - Criar conta bancária");
        System.out.println("1 - Realizar depósito");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Exibir saldo");
        System.out.println("Valor negativo - Encerrar sistema");
        System.out.print("Informe a opção desejada: ");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnum = new Random();
        int opcao, numeroConta, numero;
        double quantia, saldo;
        String nome;
        do{
            exibeOpcoes();
            opcao = in.nextInt();
            
            switch (opcao){
                case 0:
                    System.out.print("Informe seu nome: ");
                    nome = in.next();
                    numeroConta = rnum.nextInt(9999);
                    ContaBancaria conta = new ContaBancaria(numeroConta, nome);
                    conta.toString();
                case 1:
                    System.out.print("Informe seu nome: ");
                    nome = in.next();
                    numeroConta = rnum.nextInt(9999);
                    ContaBancaria conta1 = new ContaBancaria(numeroConta, nome);
                    conta1.toString();
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    System.out.println("Informe a quantia que deseja depositar: ");
                    quantia = in.nextDouble();
                    conta1.depositar(numero, quantia);
                case 2:
                    System.out.print("Informe seu nome: ");
                    nome = in.next();
                    numeroConta = rnum.nextInt(9999);
                    ContaBancaria conta2 = new ContaBancaria(numeroConta, nome);
                    conta2.toString();
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    System.out.println("Informe a quantia que deseja sacar: ");
                    quantia = in.nextDouble();
                    conta2.sacar(numero, quantia);
                case 3:
                    System.out.print("Informe seu nome: ");
                    nome = in.next();
                    numeroConta = rnum.nextInt(9999);
                    ContaBancaria conta3 = new ContaBancaria(numeroConta, nome);
                    conta3.toString();
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    saldo = conta3.getSaldo(numero);
                    if (saldo == -1) {
                        System.out.println("Conta não encontrada.");
                    } else {
                        System.out.println("Saldo: " + saldo);
                    }
            }
        }while(opcao >= 0);
        
        System.out.println("Sistema encerrado!");
    }
    
}
