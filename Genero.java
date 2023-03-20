package lista2;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu sexo. M para masculino e F para feminino.");
		String genero = entrada.next();
		
		if (genero.equals("M")) {
			
			System.out.println("MASCULINO");
		}
		else if (genero.equals("F")) {
			
			System.out.println("FEMININO");
		}
		else {
			
			System.out.println("ERROR");
		}
	}

}
