package estruturaCondicional;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("NÃO NEGATIVO!");
		}else {
			System.out.println("NEGATIVO!");
		}
		
		sc.close();
	}

}
