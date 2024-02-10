package estruturaEntradaProcessamentoSaida;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("DIFERENÇA = " + (a * b - c * d));
		
		sc.close();
	}

}
