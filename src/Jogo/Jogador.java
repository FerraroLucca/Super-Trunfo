
package Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
	
    private List<Carta> maoJogador;

    //Construtor
    public Jogador() {
        this.maoJogador = new ArrayList<>();
    }
    
    //Método para adiciar carta na mão do jogador
    public void adicionarCarta(Carta carta) {
        maoJogador.add(carta);
    }

    // Método para o jogador escolher uma carta
    public Carta escolherCarta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma carta para jogar: ");
        for (int i = 0; i < maoJogador.size(); i++) {
            Carta carta = maoJogador.get(i);
        }
        
        int escolha = scanner.nextInt() - 1; 
        scanner.nextLine(); 

        // Verificar se a escolha é válida
        if (escolha >= 0 && escolha < maoJogador.size()) {
            return maoJogador.remove(escolha); 
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
            return escolherCarta(); // Chama novamente se a escolha for inválida
        }
    }

    // Método para exibir as cartas na mão do jogador
    public void exibirCartas() {
        System.out.println("Cartas na mão do jogador:");
        for (int i = 0; i < maoJogador.size(); i++) {
            Carta carta = maoJogador.get(i);
            System.out.println("Carta " + (i + 1) + " - Ataque: " + carta.getAtaque() +
                    " | Defesa: " + carta.getDefesa() +
                    " | Velocidade: " + carta.getVelocidade());
        }
    }
}
