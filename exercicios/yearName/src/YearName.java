/*
 * Escreva um código que receba o nome e o ano de nascimento de alguém e 
 * imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
import java.util.Scanner;

public class YearName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Write your name: ");
        var name = input.nextLine();

        System.out.print("Write your age: ");
        var age = input.nextInt();

        System.out.printf("Hello, %sname! You have %dage years.", name, age);

        input.close();
    }
}
