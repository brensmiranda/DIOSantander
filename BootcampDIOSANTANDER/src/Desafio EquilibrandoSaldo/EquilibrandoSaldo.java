package AtividadesDIO;

import java.util.Scanner;
public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoAtual, valorDeposito, valorRetirada;

        saldoAtual = scanner.nextDouble();

        valorDeposito = scanner.nextDouble();


        valorRetirada = scanner.nextDouble();

        saldoAtual = saldoAtual + valorDeposito - valorRetirada;
        System.out.println("\nSaldo atualizado na conta: " + saldoAtual);
    }
}