package estruturaWhile;

import java.util.Scanner;

public class Exe1 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("SENHA INVÁLIDA");
			System.out.println();
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
		sc.close();
	}
	
}
