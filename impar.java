import java.util.Scanner;

public class impar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero � par");
			
		}
		else {
			System.out.println("O n�mero � �mpar");
		}
	}

}
