package AtividadesDIO;
import java.util.Scanner;
public class DesafioCondicionalmenteRico {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if(valorSaque <= saldoTotal && saldoTotal >= valorSaque){
            saldoTotal-=valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo:" + saldoTotal);     }
        else{
            System.out.println("Saldo insuficiente. Saque nao realizado!");
            }
                    scanner.close();
        }

    }


