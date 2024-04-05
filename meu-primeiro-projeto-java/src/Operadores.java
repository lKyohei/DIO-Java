public class Operadores {

    public static void main(String[] args) {

        //Operadores aritméticos.
        // = -> atribuição
        System.out.println("Operador de atribuição.");
        String nome = "Eduardo";
        int idade = 22;
        char sexo = 'M';
        System.out.println(nome +"\n"+ idade + "\n" + sexo);

        // +, -, *, /, %
        System.out.println("Operadores aritméticos.");
        double soma = 10.5 +15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 8;
        int divisao = 15/3;
        int modulo = 18 % 3;
        double resultado = (10*7)+(20/4);
        System.out.println(soma + "\n" + subtracao + "\n" + multiplicacao +
        "\n" + divisao + "\n" + modulo + "\n" + resultado);

        //Operadores Unários.

        //Operador unário de valor positivo(+) = numeros são positivos sem esse operador explicitamente.
        //Operador unário de valor negativo(-) = nega um número ou expressão aritmética.
        System.out.println("Operadores Unários.");
        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;//tornar o valor positivo.
        System.out.println(numero);

        //Operador de incremento(++) e decremento(--) que incremente e decrementa o valor em 1.
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        //Operador unário lógico de negação(!) - nega o valor de uma expressão booleana.
        boolean variavel = true;
        System.out.println(!variavel);

        //variavel = !variavel;
        System.out.println(variavel);
        
        //Operador Ternário.
        //<expressão condicional> ? <caso condição seja true> : <caso condição seja false>

        int a, b;
        a = 6;
        b = 6;

        String operacao = a==b ?"verdadeiro" : "falso";
        System.out.println(operacao);

        //Operadores relacionais.
        int number = 1;
        int number2 = 2;

        boolean simNao = number == number2;
        System.out.println("Numero1 é igual a numero2 " + simNao);
        
        simNao = number != number2;
        System.out.println("Numero1 é diferente de numero2 " + simNao);

        simNao = number > number2;
        System.out.println("Numero1 é maior que numero2 " + simNao);

        //comparando strings.
        String nomeUm = "Edu";
        String nomeDois = new String("Edu");

        System.out.println(nomeUm.equals(nomeDois));

        // && AND e || Or
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições são verdeiras.");
        }
        
    }
}