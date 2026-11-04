package vetor;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int TAM = 10;
        int a[], b[], i, soma;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite um numero:");
            a[i] = ler.nextInt();
        }

        soma = 0;

        for (i = 0; i < TAM; i++) {
            soma = soma + a[i];
        }

        for (i = 0; i < TAM; i++) {
            b[i] = soma;
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i] + "   B[" + i + "] = " + b[i]);
        }

    }
}