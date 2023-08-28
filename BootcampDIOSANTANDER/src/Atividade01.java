//
import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe seu nome: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Informe seu o numero da Conta: ");
        int numeroConta = entrada.nextInt();
        entrada.nextLine(); //buffer de entrada.
        System.out.println("Informe o número da Agência: ");
        String numeroAgencia = entrada.nextLine();
        System.out.println("Saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Saldo: " + saldo);

        entrada.close();

    }}