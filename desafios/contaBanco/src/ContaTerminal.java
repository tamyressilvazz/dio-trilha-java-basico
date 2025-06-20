import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente =  input.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String numAgencia =  input.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        int agencia =  input.nextInt();

        System.out.print("Por favor, digite o saldo: ");
        Double saldo =  input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
