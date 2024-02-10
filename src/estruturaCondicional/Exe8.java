package estruturaCondicional;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0;
		
		System.out.println("informe a renda: ");
		double sal = sc.nextDouble();
		
		if (sal <= 2000) {
			imposto = 0.00;
		}else if(sal <= 3000) {
			imposto = (sal -2000)* 0.08;
		}else if(sal <= 4500) {
			imposto = (sal -3000)* 0.18 + 1000 * 0.08;
		}else {
			imposto = (sal -4500)* 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		if (imposto == 0) {
			System.out.println("isento");
		}else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
