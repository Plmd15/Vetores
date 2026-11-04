package vetor;

import java.util.Scanner;

public class filamerenda {
	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		final int HUM = 10;
		int sm[], sr[], a, s, se, h, j, i;
		h = 0;
		sm = new int [HUM];
		sr = new int [HUM];
		
			for(i=0; i<10; i++) {
					System.out.println("Retire sua senha apertando 1:");
					a = ler.nextInt();
		
				if(a==1) {
					sm[i]=i+1;
					System.out.println("Sua senha é: " + (sm[i]));
					
			}else {
				System.out.println("Digitou errado tente denovo.");
				i--;
			}
		}
			for(i=0; i<10; i++){
				System.out.println("Digite sua senha:");
				se = ler.nextInt();
			h=0;	
			for(j=0; j < 10; j++) {
				if(se == sm[j]) {
				sm[j] = sr[j];
				h++;
				break;
			}else if(se != sm[j]){
				h = 0;
			}
			}
			if(h>0){
				System.out.println("Pode retirar a merenda.");
			}else {
				System.out.println("Você já pegou!");
			}
		}
	}
}

