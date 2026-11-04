package vetor;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int TAM = 10;
        int a[], i, j;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite um numero:");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            System.out.println("Numeros pares ate " + a[i] + ":");

            for (j = 0; j <= a[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }

        }

    }
}