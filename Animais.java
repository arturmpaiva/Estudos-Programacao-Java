package lista2;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Eh mamifero? sim ou nao");
		String mamifero = entrada.next();
		
		if (mamifero.equals("sim")) {
			System.out.println("Eh quadrupede? sim ou nao");
			String quadrupede = entrada.next();
			
			if (quadrupede.equals("sim")) {
				System.out.println("Eh carnivoro? sim ou nao");
				String carnivoro = entrada.next();
				
				if (carnivoro.equals("sim")) {
					System.out.println("O animal escolhido foi o leao");
				}
				else if (carnivoro.equals("nao")) {
					System.out.println("Eh herbivoro? sim ou nao");
					String herbivoro = entrada.next();
					
					if (herbivoro.equals("sim")) {
						System.out.println("O animal escolhido foi o cavalo");
					}
					else {
						System.out.println("ERROR");
					}
					}
			}
			else if (quadrupede.equals("nao")) {
				System.out.println("Eh bipede? sim ou nao");
				String bipede = entrada.next();
				
				if (bipede.equals("sim")) {
					System.out.println("Eh onivoro? sim ou nao");
					String onivoro = entrada.next();
					
					if (onivoro.equals("sim")) {
						System.out.println("O animal escolhido foi o homem");
					}
					else if (onivoro.equals("nao")) {
						System.out.println("Eh frutifero? sim ou nao");
						String frutifero = entrada.next();
						
						if (frutifero.equals("sim")) {
							System.out.println("O animal escolhido foi o macaco");
						}
						else {
							System.out.println("ERROR");
					}
				}
				}
				else if (bipede.equals("nao")) {
					System.out.println("Eh voador? sim ou nao");
					String voador = entrada.next();
					
					if (voador.equals("sim")) {
						System.out.println("O animal escolhido foi o morcego");
				}
					else if (voador.equals("nao")) {
						System.out.println("Eh aquatico? sim ou nao");
						String aquatico = entrada.next();
						
						if (aquatico.equals("sim")) {
							System.out.println("O animal escolhido foi a baleia");
						}
						else {
							System.out.println("ERROR");
						}
					}
					}
			}
		}
		else if (mamifero.equals("nao")) {
			System.out.println("Eh uma ave? sim ou nao");
			String ave = entrada.next();
			
			if (ave.equals("sim")) {
				System.out.println("Eh voadora? sim ou nao");
				String voadora = entrada.next();
				
				if (voadora.equals("nao")) {
					System.out.println("Eh tropical? sim ou nao");
					String tropical = entrada.next();
					
					if (tropical.equals("sim")) {
						System.out.println("O animal escolhido foi o avestruz");
					}
					else if (tropical.equals("nao")){
						System.out.println("Eh polar? sim ou nao");
						String polar = entrada.next();
						
						if (polar.equals("sim")) {
							System.out.println("O animal escolhido foi o pinguim");
						}
						else {
							System.out.println("ERROR");
					}
				}
			}
				else if (voadora.equals("sim")) {
					System.out.println("Eh nadadora? sim ou nao");
					String nadadora = entrada.next();
					
					if (nadadora.equals("sim")) {
						System.out.println("O animal escolhido foi o pato");
					}
					else if (nadadora.equals("nao")) {
						System.out.println("Eh de rapina? sim ou nao");
						String rapina = entrada.next();
						
						if (rapina.equals("sim")) {
							System.out.println("O animal escolhido foi a aguia");
						}
						else {
							System.out.println("ERROR");
						}
						
					}
						
					}
				}
			else if (ave.equals("nao")) {
				System.out.println("Eh um reptil? sim ou nao");
				String reptil = entrada.next();
				
				if (reptil.equals("sim")) {
					System.out.println("Com casco? sim ou nao");
					String casco = entrada.next();
					
					if (casco.equals("sim")) {
						System.out.println("O animal escolhido foi a tartaruga");
					}
					else if (casco.equals("nao")) {
							System.out.println("Eh carnivoro? sim ou nao");
							String carnivoro = entrada.next();
							
							if (carnivoro.equals("sim")) {
								System.out.println("O animal escolhido foi o crododilo");
						}
							else if (carnivoro.equals("nao")) {
								System.out.println("Tem patas? sim ou nao");
								String patas = entrada.next();
								
								if (patas.equals("nao")) {
									System.out.println("O animal escohido foi a cobra");
								}
								else if (patas.equals("sim")) {
									System.out.println("ERROR");
								}
							}
					}
				}
				else if (reptil.equals("nao")) {
					System.out.println("ERROR");
				}
			}
		}

	}

}
