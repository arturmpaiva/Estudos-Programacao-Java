package lista2;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros para serem divididos: ");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		
		double divisao = n1 / n2;
		
		if (n2 == 0) {
			
			System.out.println("ERROR");
		}
		else {
			System.out.println("A divisao e " + divisao);
		}

	}

}
