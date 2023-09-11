import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (saldoTotal >= valorSaque) {
            saldoTotal -= valorSaque;
            System.out.print("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
        } else {
            System.out.print("Saldo insuficiente. Saque nao realizado!");
        }
    }
}