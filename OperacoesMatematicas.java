package exercicioss;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		
		double soma = n1 + n2;
		double subtracao = n1 - n2;
		double multiplicacao = n1 * n2;
		double divisao = n1 / n2;
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A subtracao dos números é: " + subtracao);
		System.out.println("A multiplicacao dos números é: " + multiplicacao);
		System.out.println("A divisao dos números é: " + divisao);
	}

}
