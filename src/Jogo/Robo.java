package Jogo;

import java.util.List;

public class Robo {
    private List<Carta> baralho;

    // Construtor
    public Robo(List<Carta> baralho) {
        this.baralho = baralho;
    }

    // Método para escolher a melhor carta com base no atributo escolhido na rodada
    public Carta escolherMelhorCarta(String atributoEscolhido) {
        Carta melhorCarta = null;

        for (Carta carta : baralho) {
            if (melhorCarta == null) {
                melhorCarta = carta;
            } else {
                int valorAtual = 0;
                int valorMelhor = 0;

                switch (atributoEscolhido) {
                    case "1": // Ataque
                        valorAtual = carta.getAtaque();
                        valorMelhor = melhorCarta.getAtaque();
                        break;
                    case "2": // Defesa
                        valorAtual = carta.getDefesa();
                        valorMelhor = melhorCarta.getDefesa();
                        break;
                    case "3": // Velocidade
                        valorAtual = carta.getVelocidade();
                        valorMelhor = melhorCarta.getVelocidade();
                        break;
                }

                if (valorAtual > valorMelhor) {
                    melhorCarta = carta;
                }
            }
        }

        // Remove a melhor carta do baralho(escolhida acima) e a retorna
        if (melhorCarta != null) {
            baralho.remove(melhorCarta);
        }
        return melhorCarta;
    }
}


