package vetor;

import java.util.Scanner;

public class VerParImpar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i;

        a = new int[TAM];
        b = new int[TAM]; 
        
        for (i=0; i<10;i++){
			System.out.println("Digite o valor "+ (i+1) +"º valor do vetor A");
			a[i] = ler.nextInt();
		}
        for(i=0; i<10; i++) {
        	if(a[i] % 2 == 0) {
        		b[i] = 1;
        	}else {
        		b[i]=0;
        	}
        	System.out.println("O vetor b ficou assim:");
        	System.out.println(b[i]);
        }
        
        }
    }