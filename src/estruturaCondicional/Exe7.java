package estruturaCondicional;

import java.util.Scanner;

public class Exe7 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x,y;
		
		System.out.println("informe o primeiro valor: ");
		x = sc.nextDouble();
		System.out.println("informe o segundo valor: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0 ) {
			System.out.println("ORIGEM");
		}else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0){
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else { 
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
