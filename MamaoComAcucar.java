package exercicioss;

import java.util.Scanner;

public class MamaoComAcucar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra na Loja Mamão com Açúcar: ");
		double compra = entrada.nextDouble();
		
		double prestacao = compra / 5;
		
		System.out.println("O valor de cada prestação da compra será: " + prestacao);

	}

}
