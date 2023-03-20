package lista2;

import java.util.Scanner;

public class JusticaEleitoral {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		int ano = entrada.nextInt();
		
		if (ano < 1944 || ano > 1996) {
			System.out.println("Voto nao obrigatorio");
		}
		else {
			System.out.println("Voto obrigatorio");
		}

	}

}
