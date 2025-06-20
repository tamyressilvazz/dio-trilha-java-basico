/*
 * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 * fórmula: área=lado X lado
*/
import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Value of the side of the square: ");
        var sideValue = input.nextDouble();
        var potencia = 2.00;

        Double areaSquare = Math.pow(sideValue, potencia);

        System.out.println(areaSquare + " = " + sideValue + " X " + sideValue);

        input.close();
    }
}
