
package Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Crupiês são os Dealers do Poker, eles que distribuem as cartas
public class Crupie {
    
	//Atributos
    private List<Carta> baralho;
    private Random random;

    //Construtor
    public Crupie() {
        this.baralho = new ArrayList<Carta>();
        this.random = new Random();
    }

    //Método para adicionar uma carta ao baralho
    public void adicionarCarta(Carta carta) {
        baralho.add(carta);
    }
    
    //Gerador de Cartas aleatórias
    public void gerarCartasAleatorias(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int ataque = random.nextInt(21);     
            int defesa = random.nextInt(21);     
            int velocidade = random.nextInt(21); 
            Carta carta = new Carta(ataque, defesa, velocidade);
            baralho.add(carta);
        }
    }

    // Método para obter o baralho
    public List<Carta> getBaralho() {
        return baralho;
    }

    // Método para remover uma carta do baralho (para o jogador)
    public Carta removerCarta() {
        if (!baralho.isEmpty()) {
            return baralho.remove(0);
        }
        return null; 
    }
}

