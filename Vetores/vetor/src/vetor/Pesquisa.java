package vetor;

import java.util.Scanner; 
public class Pesquisa {
	public static void main(String[] args) {
		Scanner    = new Scanner(System.in);
		final int TAM = 10;
		int a[], b, c, i;
		
		a = new int [TAM];
		c = 0;
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Qual número queres achar dentro da lista?");
		 b = ler.nextInt();
		
		for(i=0; i<10; i++) {
			if(b == a[i]) {
			c++;
				System.out.println("O número está na lista");
				 System.out.println("O número "+b+" está na "+(i++)+"º posição");
			}
		}
		if(c == 0){
			System.out.println("O número não está na lista");
		}
		} 
	}
	

