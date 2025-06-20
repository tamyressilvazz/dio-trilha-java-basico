/*
 * Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // first person
        System.out.print("Name first person: ");
        String name1 = input.nextLine();
        System.out.print("Age first person: ");
        int age1 = input.nextInt();

        // second person
        System.out.print("Name second person: ");
        String name2 = input.nextLine();
        System.out.print("Age second person: ");
        int age2 = input.nextInt();

        if (age1 > age2) {
            int ageDifference = age1 - age2;
            System.out.println("The difference between " + name1 + name2 + " is: " + ageDifference);
        }else if (age2 > age1) {
            int ageDifference = age2 - age1;
            System.out.println("The difference between " + name2 + name1 + " is: " + ageDifference);
        } else {
            System.out.println("Don't exist difference between the two ages.");
        }

        input.close();
     
    }
}
