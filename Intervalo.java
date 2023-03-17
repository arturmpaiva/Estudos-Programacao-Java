package lista2;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numero = entrada.nextDouble();
		
		if(numero < 100) {
			
			System.out.println("O numero nao esta no intervalo entre 100 e 200");
		}
		else if(numero > 200) {
			
			System.out.println("O numero nao esta no intervalo entre 100 e 200");
		}
		else {
			System.out.println("O numero esta no intervalo entre 100 e 200");
		}
	}
}
