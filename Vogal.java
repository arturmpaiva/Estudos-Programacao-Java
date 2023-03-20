package lista2;

import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = entrada.next();
		
		if (letra.equals("a")) {
			System.out.println("Eh vogal");
		}
		else if(letra.equals("e")) {
			System.out.println("Eh vogal");
		}
		else if(letra.equals("i")) {
			System.out.println("Eh vogal");
		}
		else if(letra.equals("o")) {
			System.out.println("Eh vogal");
		}
		else if(letra.equals("u")) {
			System.out.println("Eh vogal");
		}
		else {
			System.out.println("Nao eh vogal");
		}
	}

}
