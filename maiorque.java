import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite um número: ");
		int n2 = entrada.nextInt();
		
		if(n1 > n2){
			
			System.out.println("O número " + n1 + " é maior que o número " + n2);
		}
		else if (n1 < n2){
			
			System.out.println("O número " + n2 + " é maior que o número " + n1);
		}
		else {
			
			System.out.println("O número " + n2 + " é igual ao número " + n1);
		}
	}

}
