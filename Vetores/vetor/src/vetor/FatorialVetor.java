package vetor;

import java.util.Scanner;

public class FatorialVetor {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int TAM = 15;
        int a[], b[], i, j, fatorial;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite um numero:");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            fatorial = 1;

            for (j = 1; j <= a[i]; j++) {
                fatorial = fatorial * j;
            }

            b[i] = fatorial;

        }

        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i] + "   B[" + i + "] = " + b[i]);
        }

    }
}