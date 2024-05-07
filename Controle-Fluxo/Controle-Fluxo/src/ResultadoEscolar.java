public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        // condição ternaria.
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        String resultaodo2 = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "reprovado";

        System.out.println(resultado);
        System.out.println(resultaodo2);

        //condição encadeada.
        if (nota >= 7)
            System.out.println("Aprovado");
        
        else if (nota >= 5 && nota <7){
            System.out.println("Prova de recuperação.");
        }

        else
            System.out.println("Reprovado");
        
    }
}
