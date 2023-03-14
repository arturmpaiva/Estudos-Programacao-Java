package exercicioss;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuário: ");
		String nome = entrada.next();
		
		System.out.println("Digite o peso do usuário em kg: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a altura do usuário em metros: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
				
		System.out.println("O IMC de " + nome + " é: " + imc);

	}

}
