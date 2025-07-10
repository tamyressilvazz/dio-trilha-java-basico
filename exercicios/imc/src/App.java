import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = input.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println(imc);

        // verificação imc
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }else if(imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        }else if(imc >= 40.0) {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
