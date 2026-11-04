package vetor;

public class PotenciaDois {
    public static void main(String[] args) {

        final int TAM = 11;
        int a[], i, j;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {

            a[i] = 1;

            for (j = 0; j < i; j++) {
                a[i] = a[i] * 2;
            }

        }

        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }

    }
}
