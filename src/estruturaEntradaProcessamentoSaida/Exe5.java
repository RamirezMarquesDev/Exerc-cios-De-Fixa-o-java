package estruturaEntradaProcessamentoSaida;

import java.util.Locale;
import java.util.Scanner;

public class Exe5 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, n1, n2;
		double price1, price2;
		
		cod1 = sc.nextInt();
		n1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		n2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", (n1 * price1 + n2 * price2));
		
		sc.close();
	}

}
