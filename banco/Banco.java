
package banco;

import Entidades.ContaBancaria;
import java.util.Random;
import java.util.Scanner;

public class Banco {

    public static void exibeOpcoes() {
        System.out.println("Menu de opções: ");
        System.out.println("0 - Realizar depósito");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Exibir saldo");
        System.out.println("Valor negativo - Encerrar sistema");
        System.out.print("Informe a opção desejada: ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnum = new Random();
        int opcao, numeroConta, numero;
        double quantia, saldo;
        String nome;

        System.out.print("Informe seu nome: ");
        nome = in.nextLine();
        numeroConta = rnum.nextInt(1000, 9999);
        ContaBancaria conta = new ContaBancaria(numeroConta, nome);
        System.out.println(conta);

        do {
            exibeOpcoes();
            opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    System.out.println("Informe a quantia que deseja depositar: ");
                    quantia = in.nextDouble();
                    conta.depositar(numero, quantia);
                    break;
                case 1:
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    System.out.println("Informe a quantia que deseja sacar: ");
                    quantia = in.nextDouble();
                    conta.sacar(numero, quantia);
                    break;
                case 2:
                    System.out.println("Informe o número da sua conta: ");
                    numero = in.nextInt();
                    saldo = conta.getSaldo(numero);
                    if (saldo == -1) {
                        System.out.println("Conta não encontrada.");
                    } else {
                        System.out.println("Saldo: " + saldo);
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente: ");
            }
        } while (opcao >= 0);

        System.out.println("Sistema encerrado!");

        in.close();
    }

}
