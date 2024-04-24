import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int conta = 0;
        String Agencia;
        String NomeCliente;
        float Saldo = 0;

        System.out.println("Por favor, digite o número da Agência.\n");
        Agencia = scanner.nextLine();

        System.out.println("digite o número da sua conta\n");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome\n");
        NomeCliente = scanner.nextLine();

        System.out.println("Digite o Saldo que está disponivel na sua conta.\n");
        Saldo = scanner.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        Agencia + ", conta" + conta + " e seu saldo" + Saldo + " já está disponível para saque." );

        scanner.close();
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //obter pela scanner os valores digitados no terminal
        //exibir a mensagem;    
    }
}
