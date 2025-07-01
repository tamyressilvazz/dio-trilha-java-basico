import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        var nomeCliente =  input.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        var numAgencia =  input.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        var agencia =  input.nextInt();

        System.out.print("Por favor, digite o saldo: ");
        var saldo =  input.nextDouble();

        System.out.printf("Olá %snomeCliente, obrigado por criar uma conta em nosso banco, sua agência é %dagencia , conta %dnumAgencia  e seu saldo %fsaldo já está disponível para saque.", nomeCliente, agencia, numAgencia, saldo);
    }
}
