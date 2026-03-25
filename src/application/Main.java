package application;

import entities.Cliente;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("   Bem-vindo ao Banco    ");
        System.out.println("=========================");

        // Coleta os dados básicos da conta
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        // Verifica se o cliente quer abrir a conta com saldo inicial
        System.out.print("Depósito inicial? (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);

        Cliente cliente;

        if (resposta == 'S') {
            System.out.print("Valor do depósito inicial: ");
            double saldoInicial = sc.nextDouble();
            cliente = new Cliente(numeroConta, nome, saldoInicial);
        } else {
            cliente = new Cliente(numeroConta, nome);
        }

        exibirDados(cliente);

        // Depósito
        System.out.print("Valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        cliente.depositar(valorDeposito);

        exibirDados(cliente);

        // Saque
        System.out.print("Valor para sacar: ");
        double valorSaque = sc.nextDouble();
        cliente.sacar(valorSaque);

        exibirDados(cliente);

        sc.close();
    }

    // Evita repetir o bloco de impressão toda hora
    private static void exibirDados(Cliente cliente) {
        System.out.println("=========================");
        System.out.println(cliente);
        System.out.println("=========================");
    }
}