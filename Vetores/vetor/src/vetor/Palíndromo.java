package vetor;

import java.util.Scanner;

public class Palíndromo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM =10;
		int a[],i;
		
		a = new int [TAM];
		
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0;i<=4;i++) {
			if(a[i] != a[9-i]) {
				System.out.println("Não é um palímdromo");
				break;
			}
		}for(i=0;i<=4;i++) {
			if(a[i] == a[9-i]) {
				System.out.println("é um palímdromo");
				break;
			}
		
		}
}
}