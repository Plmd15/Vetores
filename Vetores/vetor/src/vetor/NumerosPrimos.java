package vetor;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int TAM = 10;
        int a[], i, divisor, primo;

        a = new int[TAM];

        for ( i= 0; i < TAM; i++) {
            System.out.println("Digite um numero:");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            primo = 0;

            for (divisor = 1; divisor <= a[i]; divisor++) {
                if (a[i] % divisor == 0) {
                    primo++;
                }
            }

            if (primo == 2) {
                System.out.println(a[i] + " é primo");
            } else {
                System.out.println(a[i] + " não é primo");
            }

        }

    }
}