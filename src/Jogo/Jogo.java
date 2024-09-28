
package Jogo;

import java.util.Scanner;

public class Jogo {
	
    public static void main(String[] args) {
    	Thread thread = new Thread();
    	Formatador formatador = new Formatador();
        Crupie crupie = new Crupie();
        Robo robo = new Robo(crupie.getBaralho());
        Jogador jogador = new Jogador();
        Placar placar = new Placar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando cartas...\n");
        
        formatador.processamento();
        
        crupie.gerarCartasAleatorias(20);
        
        System.out.println("Distribuindo cartas...\n");
        
        formatador.processamento();
        
        // Adiciona as cartas ao jogador
        for (int i = 0; i < 10; i++) {
            jogador.adicionarCarta(crupie.removerCarta());
        }

        int rodada = 0;
        while (rodada < 10) {
        	
        	formatador.pulaLinha();
        	
        	// Exibir as cartas na mão do jogador após a rodada
            jogador.exibirCartas();
            
            //Mensagem de escolha par o jogador
            System.out.println("\nRodada " + (rodada + 1));
            System.out.print("Escolha o atributo a ser avaliado:\n 1 - Ataque\n 2 - Defesa\n 3 - Velocidade\nEscolha: ");
            String atributoEscolhido = scanner.nextLine();

            // Jogador escolhe uma carta
            Carta cartaJogador = jogador.escolherCarta();
            
            // Robô escolhe a melhor carta com base no atributo
            Carta cartaRobo = robo.escolherMelhorCarta(atributoEscolhido); 

            int valorJogador = 0;
            int valorRobo = 0;
            
            switch (atributoEscolhido) {
                case "1":
                    valorJogador = cartaJogador.getAtaque();
                    valorRobo = cartaRobo.getAtaque();
                    break;
                case "2":
                    valorJogador = cartaJogador.getDefesa();
                    valorRobo = cartaRobo.getDefesa();
                    break;
                case "3":
                    valorJogador = cartaJogador.getVelocidade();
                    valorRobo = cartaRobo.getVelocidade();
                    break;
                default:
                    System.out.println("Atributo inválido. Tente novamente.");
                    continue;
            }
            
            //Comparação das cartas jogadas pelo Jogador e pelo Robo
            System.out.println("Valor do Jogador: " + valorJogador);
            System.out.println("Valor do Robô: " + valorRobo + "\n");
            
            formatador.processamento();

            // Comparando os valores e atribuindo pontos
            if (valorJogador > valorRobo) {
                System.out.println("Jogador ganhou esta rodada!\n");
                placar.jogadorGanhou();
            } else if (valorRobo > valorJogador) {
                System.out.println("Robô ganhou esta rodada!\n");
                placar.roboGanhou();
            } else {
                System.out.println("Empate nesta rodada!\n");
            }

            formatador.processamento();
            
            //Exibe o placar ao fim de todas as rodadas
            placar.exibePlacar();
            
            formatador.processamento();
            
            rodada++;
        }

        //Exibir resultado final
        formatador.pulaLinha();
        
        if (placar.getPontosJogador() > placar.getPontosRobo()) {
            placar.venceu();
        } else if (placar.getPontosRobo() > placar.getPontosJogador()) {
            placar.perdeu();
        } else {
        	placar.empatou();
        }
        
        scanner.close();
    }
}
