package exercicioss;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius :");
		double C = entrada.nextDouble();
		
		double Fahrenheit = C * 1.8 + 32;
				
		System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
		
	}

}
