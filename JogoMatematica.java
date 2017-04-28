import java.util.Random;
import java.util.Scanner;

public class JogoMatematica {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;		
		int fim = 9;
		int resposta = 0, gabarito = 0;		
		int opcao = 0;		
		Scanner leitor = new Scanner(System.in);
		while (opcao != 2){
			int tentativa = 3;
			int pontuacao = 0;
			System.out.println(" Jogo de Matemática ");
			System.out.println("********************* ");
			System.out.println("* 1 - Novo Jogo     * ");
			System.out.println("* 2 - Sair          * ");
			System.out.println("********************* ");
			opcao = leitor.nextInt();
			


			if (opcao == 1){ 		
				System.out.println("*      NÍVEL 01     *");										

				for (int inicio = 0; inicio < 10; inicio++){ 
					if (tentativa > 0){
						System.out.println("Tentativas restantes "+ tentativa + "// Pontuação " + pontuacao);						
												
						int num1 = (int) (Math.random()*10);
						int num2 = (int) (Math.random()*10);
						Random gerador = new Random();
						int operador = (int) (gerador.nextInt(2));

						switch (operador){					        	
						case 0:
							System.out.println("Qual é o resultado da soma entre os numeros");
							gabarito = num1 +  num2;
							System.out.println(num1 + "+"  + num2 +" = ");
							break;

						case 1:
							System.out.println("Qual é o resultado da subtração entre os numeros");
							gabarito = num1 -  num2;
							System.out.println(num1 + "-"  + num2 +" = ");
							break;
						}

						System.out.println("Sua resposta: ");
						resposta = sc.nextInt();
						if(resposta == gabarito){
							System.out.println("Você acertou");
							pontuacao = pontuacao + 1;								

						}else{
							System.out.println("Você ERROU");
							System.out.println("Resposta certa: " + gabarito);
							tentativa = tentativa - 1;
							if(tentativa == 0){
								System.out.println("GAME OVERRRRRRR");
								break;									

							}					

						}

					}

				}
				
				if (tentativa != 0){
					System.out.println("*      NÍVEL 02     *");
					for (int inicio = 0; inicio < 10; inicio++){ 
						if (tentativa > 0){
							System.out.println("Tentativas restantes "+ tentativa + "// Pontuação " + pontuacao);						
							System.out.println("Qual é o resultado da multiplicação entre os numeros");						
							int num1 = (int) (Math.random()*10);
							int num2 = (int) (Math.random()*10);
							gabarito = num1 *  num2;
							System.out.println(num1 + "*"  + num2 +" = ");
							System.out.println("Sua resposta: ");
							resposta = sc.nextInt();
							
							if(resposta == gabarito){
								System.out.println("Você acertou");
								pontuacao = pontuacao + 1;								

							}else{
								System.out.println("Você ERROU");
								System.out.println("Resposta certa: " + gabarito);
								tentativa = tentativa - 1;
								if(tentativa == 0){
									System.out.println("GAME OVERRRRRRR");									
									break;										

								}					

							}

						}

					}					
				}
				
				if (tentativa != 0){
					System.out.println("*      NÍVEL 03     *");
					for (int inicio = 0; inicio < 10; inicio++){ 
						if (tentativa > 0){
							System.out.println("Tentativas restantes "+ tentativa + "// Pontuação " + pontuacao);						
							System.out.println("Qual é o resultado da divisão entre os numeros");						
							int num1 = (int) (Math.random()*10) +1;
							int num2 = (int) (Math.random()*10);
							int num3 = num1 * num2;
							gabarito = num3 / num1;
							System.out.println(num3 + "/"  + num1 +" = ");								
							System.out.println("Sua resposta: " );
							resposta = sc.nextInt();							
							if(resposta == gabarito){
								System.out.println("Você acertou");
								pontuacao = pontuacao + 1;								

							}else{
								System.out.println("Você ERROU");
								System.out.println("Resposta certa: " + gabarito);
								tentativa = tentativa - 1;
								if(tentativa == 0){
									System.out.println("GAME OVERRRRRRR");									
									break;										

								}					

							}

						}

					}					
				}
				
				if (tentativa != 0){
					System.out.println("*      NÍVEL 04     *");										
	
					for (int inicio = 0; inicio < 10; inicio++){ 
						if (tentativa > 0){
							System.out.println("Tentativas restantes "+ tentativa + "// Pontuação " + pontuacao);						
							System.out.println("Qual é o resultado da operação");						
							int num1 = (int) (Math.random()*100) +1;
							int num2 = (int) (Math.random()*100);
							Random gerador = new Random();
							int operador = (int) (gerador.nextInt(4));
	
							switch (operador){					        	
							case 0:
								gabarito = num1 +  num2;
								System.out.println(num1 + "+"  + num2 +" = ");
								break;
	
							case 1:
								gabarito = num1 -  num2;
								System.out.println(num1 + "-"  + num2 +" = ");
								break;
							case 2:
								gabarito = num1 *  num2;
								System.out.println(num1 + "*"  + num2 +" = ");
								break;
							case 3:
								int num3 = num1 * num2;
								gabarito = num3 /  num1;
								System.out.println(num3 + "/"  + num1 +" = ");
								break;
							}
	
							System.out.println("Sua resposta: ");
							resposta = sc.nextInt();
							if(resposta == gabarito){
								System.out.println("Você acertou");
								pontuacao = pontuacao + 1;								
	
							}else{
								System.out.println("Você ERROU");
								System.out.println("Resposta certa: " + gabarito);
								tentativa = tentativa - 1;
								if(tentativa == 0){
									System.out.println("GAME OVERRRRRRR");
									break;										
	
								}					
	
							}
	
						}	
	
					}
				}
				
			}	
		}
	}
}
