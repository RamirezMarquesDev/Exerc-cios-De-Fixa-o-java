package estruturaWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int alcool = 0;
	        int gasolina = 0;
	        int diesel = 0;
	        int codigo;

	        do {
	            System.out.println("Digite o tipo de combustível (1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim): ");
	            codigo = scanner.nextInt();

	            switch (codigo) {
	                case 1:
	                    alcool++;
	                    break;
	                case 2:
	                    gasolina++;
	                    break;
	                case 3:
	                    diesel++;
	                    break;
	                case 4:
	                    break; // Encerrar o loop
	                default:
	                    System.out.println("Código inválido. Digite novamente.");
	            }
	        } while (codigo != 4);

	        System.out.println("MUITO OBRIGADO");
	        System.out.printf("Clientes que abasteceram:%nÁlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);

	        scanner.close();
	    }
	}