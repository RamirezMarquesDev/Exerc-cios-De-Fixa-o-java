package estruturaEntradaProcessamentoSaida;

import java.util.Locale;
import java.util.Scanner;

public class Exe2 {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * Math.pow(R, R);

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}

}
