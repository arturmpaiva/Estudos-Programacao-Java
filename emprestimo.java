import java.util.Scanner;

public class emprestimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine().toUpperCase();
		
		System.out.println("Digite o valor do sal�rio bruto: ");
		double salario = entrada.nextDouble();
		
		System.out.println("Digite o valor do sal�rio bruto: ");
		double prestacao = entrada.nextDouble();
		
		double limite = salario * 0.3;

		if (prestacao <= limite) {
			System.out.println("O empr�stimo pode ser concedido, " + nome);
			
		}
		else {
			System.out.println("O empr�stimo n�o pode ser concedido, " + nome);
			
		}
		
	}

}
