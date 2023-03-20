package lista2;

import java.util.Scanner;

public class PoluicaoIndustrias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o indice de poluicao medido: ");
		double poluicao = entrada.nextDouble();
		
		if (poluicao >= 0.3 && poluicao < 0.4) {
			System.out.println("Industrias do primeiro grupo devem suspender suas atividades!");
		}
		else if (poluicao >= 0.4 && poluicao < 0.5) {
			System.out.println("Industrias do segundo grupo devem suspender suas atividades e pagar multa!");
		}
		else if (poluicao >= 0.5) {
			System.out.println("TODAS as industrias do primeiro, segundo e terceiro grupos devem paralisar suas atividades!");
		}
		else {
			System.out.println("Nenhuma industria precisa suspender atividades");
		}
		
	}

}
