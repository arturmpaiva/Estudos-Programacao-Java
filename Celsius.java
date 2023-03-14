package exercicioss;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double F = entrada.nextDouble();
		
		double Celsius = (5*(F-32)/9);
		
		System.out.println("A temperatura em Celsius é: " + Celsius);
	}

}
