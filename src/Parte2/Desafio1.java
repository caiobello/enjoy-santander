package Parte2;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();
        ContaBancaria conta1 = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.println("Informacoes:\nConta: " + conta1.numero + "\nTitular: " + conta1.titular + "\nSaldo: R$ " + conta1.saldo);
    }
}

class ContaBancaria2 {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria2(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
