package estruturaEntradaProcessamentoSaida;

import java.util.Locale;
import java.util.Scanner;

public class Exe4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, horas;
		double price;
		
		n = sc.nextInt();
		horas = sc.nextInt();
		price = sc.nextDouble();
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n",(price * horas));
		
		sc.close();
	}

}
