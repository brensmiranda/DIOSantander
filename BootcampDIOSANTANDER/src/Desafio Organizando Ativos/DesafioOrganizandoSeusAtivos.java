package AtividadesDIO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesafioOrganizandoSeusAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > (); //lista de array do tipo string

        // Entrada da quantidade de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();

            //Entrada dos tipos de ativos

        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }
            Collections.sort(ativos); // ordenar os ativos em ordem alfabética.
        for (String codigoAtivo : ativos) {
            System.out.println(codigoAtivo); //Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.

        }
    }

}


