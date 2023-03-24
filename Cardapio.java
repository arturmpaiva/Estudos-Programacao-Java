package exercicioscondicional;

import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo do item e a quantidade dele");
		int item = entrada.nextInt();
		int quantidade = entrada.nextInt();
		
		if(item == 1) {
			double preco = quantidade * 4;
			System.out.println("O valor a pagar sera de " + preco);
		}
		else if (item == 2) {
			double preco = quantidade * 4.5;
			System.out.println("O valor a pagar sera de " + preco);
		}
		else if (item == 3) {
			double preco = quantidade * 5;
			System.out.println("O valor a pagar sera de " + preco);
		}
		else if (item == 4) {
			double preco = quantidade * 2;
			System.out.println("O valor a pagar sera de " + preco);
		}
		else if (item == 5) {
			double preco = quantidade * 1.5;
			System.out.println("O valor a pagar sera de " + preco);
		}
		else {
			System.out.println("ERROR");
		}
	}

}
