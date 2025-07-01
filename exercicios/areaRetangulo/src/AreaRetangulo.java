/*
 * Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
 *  fórmula: área=base X altura
 */

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Base value: ");
        var base = input.nextDouble();

        System.out.print("Height value: ");
        var height = input.nextDouble();

        Double area = base * height;

        System.out.printf("%farea = %fbase X %fheight", area, base, height);

        input.close();
    }
}
