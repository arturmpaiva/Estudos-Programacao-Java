package lista2;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Diga seu sexo: digite 1 para Homem e 2 para Mulher.");
		int sexo = entrada.nextInt();
		
		System.out.println("Diga sua altura");
		double altura = entrada.nextDouble();

		double pesoH = (72.7 * altura) - 58;
		double pesoM = (62.1 * altura) - 44.7;
		
		if (sexo == 1) {
			
			System.out.println("Seu peso ideal eh " + pesoH);
		}
		else {
			
			System.out.println("Seu peso ideal eh " + pesoM);
		}
	}

}
