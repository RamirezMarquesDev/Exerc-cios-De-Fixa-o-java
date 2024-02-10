package estruturaWhile;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		String quadrante = "";

		System.out.println("Informe o valor de x: ");
		x = sc.nextInt();

		System.out.println("Informe o valor de y: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				quadrante = "primeiro";
			} else if (x < 0 && y > 0) {
				quadrante = "segundo";
			} else if (x < 0 && y < 0) {
				quadrante = "terceiro";
			} else {
				quadrante = "quarto";
			}

			System.out.println(quadrante);

			System.out.println("Informe o valor de x: ");
			x = sc.nextInt();

			System.out.println("Informe o valor de y: ");
			y = sc.nextInt();

		}

		sc.close();

	}

}
