
import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numConta;
        String numAgencia;
        String nomeCliente;
        double saldo;

        numConta = entrada.nextInt();
        numAgencia = entrada.next();
        nomeCliente = entrada.next();
        saldo = entrada.nextDouble();

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + numConta);
        System.out.println("Agência: " + numAgencia);
        System.out.println("Saldo: " + saldo);

        entrada.close();

    }}