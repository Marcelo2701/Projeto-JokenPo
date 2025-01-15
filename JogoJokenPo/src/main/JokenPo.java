package main;
import java.util.Scanner;
import java.util.Random;

public class JokenPo {
	
	//FUNÇÃO QUE GERA UM NÚMERO ALEATÓRIO DENTRO DO RANGE DE UM VETOR DE 3 POSIÇÕES
	public static int gerarNumero() {
		Random ram = new Random();
		int vetorNumero[] = {0,2,5};
		int indiceAleatorio = ram.nextInt(vetorNumero.length);//PEGA O VALOR DO INDICE ESCOLHIDO ALEATORIAMENTE
		return vetorNumero[indiceAleatorio];//RETORNA O VALOR DO INDICE
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//VETOR QUE ARMAZENA AS 3 OPÇÕES DO JOGO
		String vetor[] = {"Pedra" , "Tesoura" , "Papel"};
		int vidas1 = 5,vidas2 = 5;
		
		System.out.println("*** JOGO JOKEN PO ***\n");
		System.out.println("0- PEDRA \n2- TESOURA \n5- PAPEL\n");
		
		System.out.println("Número de vidas");
		System.out.println("Maquina: " + vidas1);
		System.out.println("Jogador: " + vidas2);
		System.out.println("*************************");
		
		//LOOP PRINCIPAL, O CÓDIGO VAI RODAR ATÉ UM DOS JOGADORES FICAR COM A VIDA ZERADA
		while(vidas1 != 0 && vidas2 != 0) {
			
			//JOGADOR INSERE SUA PRIMEIRA JOGADA
			System.out.print("Jogador: ");
			int jogador = scan.nextInt();
				
				//BLOCO CONDICIONAL QUE VERIFICA SE O JOGADOR DIGITOU UMA OPÇÃO CORRESPONDE COM AS OPÇÕES DENTRO DO JOGO
				if(jogador != 0 && jogador != 2 && jogador != 5) {
					System.out.print("Opção inválida, jogue novamente: ");
					jogador = scan.nextInt();
				}
			
			//MAQUINA RECEBE SEU PRIMEIRO NUMERO GERADO
			System.out.print("Maquina: ");
			int maquina = gerarNumero();
			System.out.println(maquina);
			
			//BLOCO CONDICIONAL QUE VERIFICA E RELACAIONA CADA POSSIBILIDADE QUE HÁ SEGUINDO AS REGRAS DO JOGO
			if(jogador == 0 && maquina == 0) { 
				System.out.println(vetor[0] + " x " + vetor[0] + " = Empate" );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2);
				System.out.println("*************************");
			}else if(jogador == 0 && maquina == 2) {
				System.out.println(vetor[0] + " x " + vetor[1] + " = " + vetor[0] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1--,vidas2);
				System.out.println("*************************");
			}else if(jogador == 0 && maquina == 5) {
				System.out.println(vetor[0] + " x " + vetor[2] + " = " + vetor[2] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2--);
				System.out.println("*************************");
			}else if(jogador == 2 && maquina == 0) {
				System.out.println(vetor[1] + " x " + vetor[0] + " = " + vetor[0] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2--);
				System.out.println("*************************");
			}else if(jogador == 2 && maquina == 2) {
				System.out.println(vetor[1] + " x " + vetor[1] + " = Empate");
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2);
				System.out.println("*************************");
			}else if(jogador == 2 && maquina == 5) {
				System.out.println(vetor[1] + " x " + vetor[2] + " = " + vetor[1] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1--,vidas2);
				System.out.println("*************************");
			}else if(jogador == 5 && maquina == 0) {
				System.out.println(vetor[2] + " x " + vetor[0] + " = " + vetor[2] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1--,vidas2);
				System.out.println("*************************");
			}else if(jogador == 5 && maquina == 2) {
				System.out.println(vetor[2] + " x " + vetor[1] + " = " + vetor[1] );
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2--);
				System.out.println("*************************");
			}else if(jogador == 5 && maquina == 5) {
				System.out.println(vetor[2] + " x " + vetor[2] + " = EMPATE");
				System.out.printf("Vidas da maquina: %d\nVidas do jogador: %d%n%n",vidas1,vidas2);
				System.out.println("*************************");
			}	
		}
		
		//BLOCO CONDICINAL QUE MOSTRA NA TELA A DERROTA POR VIDAS ZERADAS
		if(vidas1 == 0) {
			System.out.println("Maquina perdeu por falta de vidas");
		}else if(vidas2 == 0) {
			System.out.println("Jogador perdeu por falta de vidas");
		}
		
		//BLOCO DE CÓDIGO QUE MOSTRA A VITÓRIA POR QUEM TIVER MAIS VIDAS SOBRANDO
		System.out.println("Vidas da maquina: " + vidas1);
		System.out.println("Vidas do jogador: " + vidas2);
		if(vidas2 > vidas1) {
			System.out.printf("Jogador venceu com %d vidas sobrando",vidas2);
		}else {
			System.out.printf("Maquina venceu com %d vidas sobrando",vidas1);
		}
		
		scan.close();
	}

}







