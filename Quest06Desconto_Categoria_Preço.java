package listaTernarioRepeticao;

import java.util.Scanner;

public class Quest06Desconto_Categoria_Preço {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = entrada.nextDouble();
		
		System.out.println("Qual a categoria do produto? A, B, C, D ou E?");
		String cat = entrada.next().toUpperCase();
		
		switch (cat) {
		case "A":
			double desconto = preco * 0.8;
			System.out.println("O produto recebe 20% de desconto! Valor final: " + desconto);
			break;
		case "B":
			desconto = preco * 0.83;
			System.out.println("O produto recebe 17% de desconto! Valor final: " + desconto);
			break;
		case "C":
			desconto = preco * 0.88;
			System.out.println("O produto recebe 12% de desconto! Valor final: " + desconto);
			break;
		case "D":
			desconto = preco * 0.92;
			System.out.println("O produto recebe 8% de desconto! Valor final: " + desconto);
			break;
		case "E":
			desconto = preco * 0.95;
			System.out.println("O produto recebe 5% de desconto! Valor final: " + desconto);
			break;
		default:
			System.out.println("O produto não possui desconto.");
			break;
		}
	}

}
