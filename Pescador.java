package lista2;

import java.util.Scanner;

public class Pescador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso do peixe em kg: ");
		double pesoPeixe = entrada.nextDouble();
		double multa = (pesoPeixe - 50) * 4;
		
		if (pesoPeixe > 50) {
			System.out.println("Seu peixe passou do limite, sua multa sera de " + multa + " reais");
		}
		else {
			System.out.println("Não tem multa pra pagar!");
		}

	}

}
