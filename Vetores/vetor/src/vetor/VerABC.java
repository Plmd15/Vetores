package vetor;

import java.util.Scanner;

public class VerABC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i;
		

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM]; 
        
        for(i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor B");
			b[i] = ler.nextInt();
		}
		System.out.println("Assim ficou o C:");
        for(i=0;i<10; i++) {
        	if(a[i]>b[i]){
        		c[i] = 1;
        	}else if(a[i]==b[i]){
        			c[i]=0;
        		}else{
        			c[i]= -1;
        		}
        	System.out.println(c[i]);
        }
   }
}