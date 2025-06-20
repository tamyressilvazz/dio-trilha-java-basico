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

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
