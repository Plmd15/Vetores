package vetor;

import java.util.Scanner;

public class ABCdiferença {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], d[], i, j;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		d = new int [TAM];
		
		
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
		for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor B");
			b[i] = ler.nextInt();
		}
		System.out.println("Os valores diferentes do vetor A é:");
		for(i=0;i<10;i++) {
			
			for(j=0;j<10;j++) {
				
				if(a[i] == b[j]) {
				d[i]++;
				}
			}
			if(d[i]==0) {
				c[i] = a[i];
				System.out.println(c[i]);
			}else {
				c[i]=0;
			}
		}
		System.out.println("Os valores diferentes do vetor B é:");
		for(i=0;i<10;i++) {
	
			for(j=0;j<10;j++) {
				
				if(b[i] == a[j]) {
				d[i]++;
				}
			}
			if(d[i]==0) {
				c[i] = b[i];
				System.out.println(c[i]);
			}else {
				c[i]=0;
			}
		}
	}
}

