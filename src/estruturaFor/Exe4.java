package estruturaFor;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double x = 0;
		double y = 0;
		
		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			}else {
				System.out.println(x/y);
			}
			
		}
		
		sc.close();
	}

}
