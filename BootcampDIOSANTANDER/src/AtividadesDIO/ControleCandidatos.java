package AtividadesDIO;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
   public static void main (String[] args) {   // invocou o metodo main mas sem utilizar.
       String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
       for (String candidato : candidatos) {
           entrandoEmContato(candidato);
       }
   }
static void entrandoEmContato(String candidato){
       int tentativasRealizadas = 1;
       boolean continuarTentando = true;
       boolean atendeu = false;
       do {
           atendeu=atender();
           continuarTentando = !atendeu;
           if (continuarTentando)
               tentativasRealizadas++;
            else
               System.out.println("Contato realizado com Sucesso! :D");

       }while (continuarTentando && tentativasRealizadas < 3);

}
   static boolean atender(){
       return new Random().nextInt(3)==1;
   }

   static void imprimirSelecionados(){
       String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
       System.out.println("Imprimindo a lista de candidatos informando o Índice do elemento.");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + "é o " + candidatos[indice]);
        }

   }
   static void selecaoCandidados(){
       String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
       int candidadosSelecionados = 0;
       int candidatosAtual =0; //indice do array.
       double salarioBase = 2000.0;
       while(candidadosSelecionados < 5 && candidatosAtual < candidatos.length){
          String candidato = candidatos[candidatosAtual];
          double salarioPretendido = valorPretendido();

           System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
           if(salarioBase >= salarioPretendido){
               System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
               candidadosSelecionados++;
           }
                candidatosAtual ++;

       }

   } static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
static void analisarCandidato(double salarioPretendido) { // após invocou o motódo void (que não tem rotorno) para criar a lógica.
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido)
        System.out.println("Ligar para candidato.");

    else if (salarioBase == salarioPretendido)
        System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");

    else
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");

    }
   }



