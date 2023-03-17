package lista2;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Diga qual combustivel pra abastecer: digite 1 para Gasolina e 2 para alcool.");
		double combustivel = entrada.nextDouble();
		
		
		System.out.println("Diga qual a capacidade do tanque: ");
		double tanque = entrada.nextDouble();
		double precogas = tanque * 3.79;
		double precoalcool = tanque * 2.9;

		if (combustivel == 1) {
			System.out.println("O valor para abastecer eh: " + precogas);
		}
		else {
			System.out.println("O valor para abastecer eh: " + precoalcool);
		}
	}

}
