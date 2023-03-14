package exercicioss;

import java.util.Scanner;

public class AntecessorPosterior {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double X = entrada.nextDouble();
		
		double antecessor = X - 1;
		double posterior = X + 1;
		
		System.out.println("O antecessor deste número é: " + antecessor);
		System.out.println("O posterior deste número é: " + posterior);
		}

}
