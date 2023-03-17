package lista2;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite um numero");
		double n2 = entrada.nextDouble();
		
		if (n1 == n2) {
			
			System.out.println("Os numeros sao iguais");
		}
		else if (n1 > n2) {
			
			System.out.println("Os numeros sao diferentes");
			System.out.println(n1 + " eh maior que " + n2);
		}
		else {
			
			System.out.println("Os numeros sao diferentes");
			System.out.println(n2 + " eh maior que " + n1);
		}

	}

}
