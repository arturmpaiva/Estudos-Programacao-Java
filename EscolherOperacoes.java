
package listaTernarioRepeticao;

import java.util.Scanner;

public class EscolherOperacoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 2 números: ");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		
		System.out.println("Qual operação deseja realizar entre o primeiro e o segundo número? ");
		System.out.println("1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");
		int operacao = entrada.nextInt();
		
		switch (operacao) {
		case 1:
			double soma = n1 + n2;
			System.out.println("Soma: " + soma);
			break;
		case 2:
			double subtracao = n1 - n2;
			System.out.println("Subtração: " + subtracao);
			break;
		case 3:
			double multiplicacao = n1 * n2;
			System.out.println("Multiplicação: " + multiplicacao);
			break;
		case 4:
			double divisao = n1 / n2;
			System.out.println("Divisão: " + divisao);
			break;
		default:
			System.out.println("Escolha inválida!");
		}
	}

}
