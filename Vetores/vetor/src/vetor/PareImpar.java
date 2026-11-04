package vetor;

import java.util.Scanner;

public class PareImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 20;
		
		int a [], b [], i, P, I;
		
		a = new int [TAM];
		b = new int [TAM];
		
		P=0;
		I = TAM - 1;
		
		 for( i=0; i<TAM; i++) {
			 System.out.println("Digite o " +(i+1)+ "numero do Vetor A");
			 a[i] = ler.nextInt();

	}

		 for( i=0; i<TAM; i++) {
			 
		if (a[i] % 2 == 0) {
			b[P] = a[i];
			P++;
		} else {
			b[I] = a[i];
			I--;
		}
}
		 System.out.println("Vetor B: ");
		 
		 for (i=0; i<TAM;i++) {
		 System.out.println(b[i] + " ");
	}
}
}