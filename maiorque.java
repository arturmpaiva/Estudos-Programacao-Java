import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
		int n2 = entrada.nextInt();
		
		if(n1 > n2){
			
			System.out.println("O n�mero " + n1 + " � maior que o n�mero " + n2);
		}
		else if (n1 < n2){
			
			System.out.println("O n�mero " + n2 + " � maior que o n�mero " + n1);
		}
		else {
			
			System.out.println("O n�mero " + n2 + " � igual ao n�mero " + n1);
		}
	}

}
