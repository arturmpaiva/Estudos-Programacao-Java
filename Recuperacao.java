package exercicioss;

import java.util.Scanner;

public class Recuperacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a nota da terceira prova: ");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua média é: " + media);
		
		if (media < 7) {
			System.out.println(nome + ", você está de recuperação!");
		}
		else {
			System.out.println(nome + ", você está aprovado!");
		}
	}

}
