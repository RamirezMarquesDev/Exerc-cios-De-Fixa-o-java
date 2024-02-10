package estruturaCondicional;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double total=0;

		System.out.println("Digite o código do Produto: ");
		int cod = sc.nextInt();
		System.out.println("Informe a quantidade: ");
		int qtd = sc.nextInt();

		if (cod == 1) {
			total = qtd * 4.00;
		} else if (cod == 2) {
			total = qtd * 4.50;
		} else if (cod == 3) {
			total = qtd * 5.00;
		} else if (cod == 4) {
			total = qtd * 2.00;
		} else {
			total = qtd * 1.50;
		} 
		System.out.printf("TOTAL: R$%.2f%n", total);
		sc.close();
	}
}
