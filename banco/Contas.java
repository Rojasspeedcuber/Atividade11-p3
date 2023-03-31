
package banco;

import Entidades.ContaBancaria;
import Entidades.ContaEspecial;
import Entidades.ContaPoupanca;

import java.util.Random;
import java.util.Scanner;

public class Contas {

    public static void exibeOpcoesPadrao() {
        System.out.println("Menu de opções: ");
        System.out.println("0 - Realizar depósito");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Exibir saldo");
        System.out.println("Valor negativo - Encerrar sistema");
        System.out.print("Informe a opção desejada: ");
    }

    public static void exibeOpcoesEspecial() {
        System.out.println("Menu de opções: ");
        System.out.println("0 - Realizar depósito");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Exibir saldo");
        System.out.print("Informe a opção desejada: ");
    }

    public static void exibeTiposConta() {
        System.out.println("Opções de contas: ");
        System.out.println("0 - Conta bancária padrão");
        System.out.println("1 - Conta poupança");
        System.out.println("2 - Conta especial");
        System.out.print("Informe a opção der conta desejada: ");
    }

    public static void exibeOpcoesPoupanca() {
        System.out.println("Menu de opções: ");
        System.out.println("0 - Realizar depósito");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Atualizar saldo");
        System.out.println("3 - Exibir saldo");
        System.out.print("Informe a opção desejada: ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnum = new Random();
        int opcao, numeroConta, numero, tipoConta;
        double quantia, saldo, taxaPoupanca;
        String nome;

        System.out.print("Informe seu nome: ");
        nome = in.nextLine();
        numeroConta = rnum.nextInt(1000, 9999);
        exibeTiposConta();
        tipoConta = in.nextInt();

        switch (tipoConta) {
            case 0:
                ContaBancaria contab = new ContaBancaria(numeroConta, nome);
                System.out.println(contab);
                do {
                    exibeOpcoesPadrao();
                    opcao = in.nextInt();

                    switch (opcao) {
                        case 0:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja depositar: ");
                            quantia = in.nextDouble();
                            contab.depositar(numero, quantia);
                            break;
                        case 1:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja sacar: ");
                            quantia = in.nextDouble();
                            contab.sacar(numero, quantia);
                            break;
                        case 2:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            saldo = contab.getSaldo(numero);
                            if (saldo == -1) {
                                System.out.println("Conta não encontrada.");
                            } else {
                                System.out.println("Saldo: " + saldo);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao >= 0);
                break;
            case 1:
                ContaPoupanca contap = new ContaPoupanca(numeroConta, nome);
                System.out.println(contap);
                do {
                    exibeOpcoesPoupanca();
                    opcao = in.nextInt();

                    switch (opcao) {
                        case 0:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja depositar: ");
                            quantia = in.nextDouble();
                            contap.depositar(numero, quantia);
                            break;
                        case 1:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja sacar: ");
                            quantia = in.nextDouble();
                            contap.sacar(numero, quantia);
                            break;
                        case 2:
                            System.out.println("Informe a taxa de rendimento da poupança: ");
                            taxaPoupanca = in.nextDouble();
                            contap.atualiza(taxaPoupanca);
                            break;
                        case 3:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            saldo = contap.getSaldo(numero);
                            if (saldo == -1) {
                                System.out.println("Conta não encontrada.");
                            } else {
                                System.out.println("Saldo: " + saldo);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao >= 0);
                break;
            case 2:
                ContaEspecial contae = new ContaEspecial(numeroConta, nome);
                System.out.println(contae);
                do {
                    exibeOpcoesEspecial();
                    opcao = in.nextInt();

                    switch (opcao) {
                        case 0:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja depositar: ");
                            quantia = in.nextDouble();
                            contae.depositar(numero, quantia);
                            break;
                        case 1:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            System.out.println("Informe a quantia que deseja sacar: ");
                            quantia = in.nextDouble();
                            contae.sacar(numero, quantia);
                            break;
                        case 2:
                            System.out.println("Informe o número da sua conta: ");
                            numero = in.nextInt();
                            saldo = contae.getSaldo(numero);
                            if (saldo == -1) {
                                System.out.println("Conta não encontrada.");
                            } else {
                                System.out.println("Saldo: " + saldo);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao >= 0);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Sistema encerrado!");

        in.close();
    }

}
