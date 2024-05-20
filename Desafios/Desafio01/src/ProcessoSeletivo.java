import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args){
        String [] candidatos = {"felipe","Marcia","Eduardo","Ivana"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
    }

    // Quarto case
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);

        }else{
            System.out.println("não conseguimos contato com " + candidato + ", número maximo de tentativas realizadas.");
        }

    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }



    // Terceiro case
    static void imprimirSelecionados(){
        String [] candidatos = {"felipe","Marcia","Eduardo","Ivana"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1)+ " é o " + candidatos[indice]);

        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    //Segundo case
    static void selecaoCandidatos(){
        String [] candidatos = {"felipe","Marcia","Eduardo","Ivana","Carol","Duda","Dani","Arthur","João", "Eve"};

        int candidatoSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase = 2000.0;

        while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatoAtual++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Primeiro Case
    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("ligar para o candidato.");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        else{
            System.out.println("Aguardando demais candidatos.");
        }
    }
}
