public class For_Array {
    //em arrays o indice inicia em ZERO.
    public static void main(String[] args) {
    String alunos[] = {"Felipe","Jonas","Judas", "Eduardo"};

        //em arrays o indice de elementos se inicia em zero.
        for (int x=0; x<alunos.length; x++){
        System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
        
        for(String aluno : alunos){
            System.out.println("O aluno no indice é: " + aluno);

        }
    }

}
