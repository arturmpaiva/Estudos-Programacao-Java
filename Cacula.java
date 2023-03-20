package lista2;

import java.util.Scanner;

public class Cacula {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite as idades de Joao, Maria e Jose, respectivamente: ");
		int joao = entrada.nextInt();
		int maria = entrada.nextInt();
		int jose = entrada.nextInt();
		
		if (joao < maria && joao < jose) {
			System.out.println("Joao e o cacula");
		}
		else if (maria < joao && maria < jose) {
			System.out.println("Maria e a cacula");
		}
		else if (jose < joao && jose < maria) {
			System.out.println("Jose e a cacula");
		}
		else {
			System.out.println("Nao tem cacula");
		}
	}

}
