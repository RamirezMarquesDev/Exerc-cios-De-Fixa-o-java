package estruturaWhile;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int g =0;
		int cod = 0;
		int d = 0;
		
		
		
		while (cod != 4) {
			
			System.out.println("Digite o Codigo do combustível: ");
			cod = sc.nextInt();
			
			switch (cod){
			case 1:
				a++;
				break;
			case 2:
				g++;
				break;
			case 3:
				d++;
				break;
			case 4:
				break;
			default:
				System.out.println("Código inválido. Digite novamente.");
				
				}
			
			System.out.println("Digite o Codigo do combustível: ");
			cod = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",a,g,d);
		
		sc.close();
		
	}
	
}
