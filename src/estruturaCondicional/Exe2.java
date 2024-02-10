package estruturaCondicional;

import java.util.Scanner;

public class Exe2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		int num = sc.nextInt();
		
		if (num %2== 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
