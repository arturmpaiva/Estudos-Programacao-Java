package lista2;

import java.util.Scanner;

public class QuiosqueSorvetes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Diga qual sabor de casquinha deseja: C para chocolate e M para morango ");
		String sabor = entrada.next();
		
		System.out.println("Diga quantas bolas deseja: ");
		int bolas = entrada.nextInt();
		
		if (sabor.equals("C") && bolas > 3) {
			System.out.println("Desconto de 10%");
		}
		else if (sabor.equals("C") && bolas <= 3) {
			System.out.println("Desconto de 5%");
		}
		else {
			System.out.println("Sem desconto");
		}
	}

}
