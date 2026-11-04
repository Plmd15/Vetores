package vetor;

import java.util.Scanner;

public class ABCinterseção {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i, j;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor B");
			b[i] = ler.nextInt();
		}
		for(i=0;i<10;i++) {
			
			for(j=0;j<10;j++) {
				
				if(a[i] == b [j]) {
					 c[i] = a[i];
					 System.out.println(c[i]);
				}
			}
		}
	}
}
