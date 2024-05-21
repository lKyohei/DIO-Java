import java.util.Scanner;


public class DesafioControleFluxo {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro\n");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:\n");
            int parametroDois = terminal.nextInt();
            
            try{
                contar(parametroUm, parametroDois);
            }catch(ParametrosInvalidosException e){
                System.out.println("O Primeiro Número informado e maior que o Segundo número\n");
            }
        }


    }

    static void contar( int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        int i;
        for (i = contagem; i > 0; i--){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
