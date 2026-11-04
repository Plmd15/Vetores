package vetor;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int TAM = 5;
        int A[], i, j;

        A = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " numero do vetor A");
            A[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("Tabuada do " + A[i]);

            for (j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }

        
    }
}