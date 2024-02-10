package estruturaCondicional;

import java.util.Scanner;

public class Exe4 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int duracao;
		
		System.out.println("Hora que começou o jogo: ");
		int ini = sc.nextInt();
		System.out.println("Hora que acabou o jogo: ");
		int fim = sc.nextInt();
		
		if (ini  < fim) {
			duracao = fim - ini; 
		}else {
			duracao = 24 - ini + fim; 
		}
		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
		
		sc.close();
	}
}
