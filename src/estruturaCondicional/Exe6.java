package estruturaCondicional;

import java.util.Scanner;

public class Exe6 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO DE 0 A 100: ");
		double num = sc.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.println("INTERVALO [0,25]");
		}else if (num > 25 && num <= 50) {
			System.out.println("INTERVALO (25,50]");
		}else if (num > 50 && num <= 75) {
			System.out.println("INTERVALO (50,75]");
		}else if (num > 75 && num <= 100) {
			System.out.println("INTRERVALO (75,100]");
		}else {
			System.out.println("FORA DE INTERVALO");
		}
		
		sc.close();
	}
}
