package lista2;

import java.util.Scanner;

public class VelocidadeMaxima {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a velocidade maxima permitida: ");
		int limite = entrada.nextInt();
		
		System.out.println("Digite a velocidade do motorista: ");
		int velocidade = entrada.nextInt();
		
		int excesso = velocidade - limite;
		
		if (excesso > 0 && excesso <= 10) {
			System.out.println("A multa a pagar eh de R$50,00");
		}
		else if(excesso > 10 && excesso <= 30) {
			System.out.println("A multa a pagar eh de R$100,00");
		}
		else if (excesso > 30) {
			System.out.println("A multa a pagar eh de R$200,00");
		}
		else {
			System.out.println("Nao tem multa pra pagar!");
		}

	}

}
