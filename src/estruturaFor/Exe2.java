package estruturaFor;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int e = 0;
		int o = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				e ++ ; 
			}else {
				o ++;
			}
			
		}
		System.out.println(e + " in");
		System.out.println(o + " out");
		sc.close();
	}
}
