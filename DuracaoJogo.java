package exercicioscondicional;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite  a hora que o jogo comecou e terminou: ");
		int inicio = entrada.nextInt();
		int termino = entrada.nextInt();
		
		int diferenca1 = termino - inicio;
		int diferenca2 = (24 - inicio) + termino;

		if (inicio < termino) {
			
			System.out.println("O jogo durou " + diferenca1 + " horas.");
		}
		else if (inicio > termino){
			
			System.out.println("O jogo durou " + diferenca2 + " horas.");
		}
		else {
			
			System.out.println("O jogo durou 24 horas.");
		}
	}

}
