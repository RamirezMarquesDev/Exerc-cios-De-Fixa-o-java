package estruturaCondicional;

import java.util.Scanner;

public class Exe3 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int num2 = sc.nextInt();
		
		if (num1 %num2 == 0 || num2 %num1 == 0) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();
	}

}
