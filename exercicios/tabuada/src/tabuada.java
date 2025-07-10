public class tabuada {
    public static void main(String[] args){
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // loop para cada numero
        for (int i = 0; i <= numeros.length; i++) {
            int j = numeros[i];

            System.out.printf("%nTabuada do %d: %n%n", j);

            // loop para cada multiplicacao
            for (int k = 1; k <= 10; k++) {
                // calculo da tabuada
                int resultado = j * k;
                System.out.printf("%d * %d = %d%n", j, k, resultado);
            }
        }
        System.out.println();
    }
}
