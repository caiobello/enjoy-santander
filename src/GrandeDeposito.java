import java.text.DecimalFormat;
import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!" + "\n" + "Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            System.out.print("Encerrando o programa...");
        } else {
            System.out.print("Valor invalido! Digite um valor maior que zero.");
        }
    }
}