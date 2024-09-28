package Jogo;

public class Placar {
	
	private int pontosJogador = 0;
	private int pontosRobo = 0;
	
	
	//getters
	public int getPontosJogador() {
		return pontosJogador;
	}
	public void setPontosJogador(int pontosJogador) {
		this.pontosJogador = pontosJogador;
	}
	public int getPontosRobo() {
		return pontosRobo;
	}

	//setters
	public void setPontosRobo(int pontosRobo) {
		this.pontosRobo = pontosRobo;
	}
	public int jogadorGanhou() {
		return pontosJogador++;
	}
	public int roboGanhou() {
		return pontosRobo++;
	}
	
	//metodo para exibir o placar a cada rodada
	public void exibePlacar() {
	 System.out.println("Pontos do Jogador: " + pontosJogador);
     System.out.println("Pontos do Robô: " + pontosRobo);
	}
	
	//desenho para personalizar a vitória
	public void venceu() {
		System.out.println(" ▀█░█▀ █▀▀ █▀▀▄ █▀▀ █▀▀ █▀▀▄ █▀▀█ █▀▀█ █\r\n"
						 + " ░█▄█░ █▀▀ █░░█ █░░ █▀▀ █░░█ █░░█ █▄▄▀ █\r\n"
						 + " ░░▀░░ ▀▀▀ ▀░░▀ ▀▀▀ ▀▀▀ ▀▀▀░ ▀▀▀▀ ▀░▀▀ ▄");
	}
	
	//desenho para personalizar a derrota
	public void perdeu() {
		System.out.println(" █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀ █░░█ █\r\n"
						 + " █░░█ █▀▀ █▄▄▀ █░░█ █▀▀ █░░█ ▀\r\n"
						 + " █▀▀▀ ▀▀▀ ▀░▀▀ ▀▀▀░ ▀▀▀ ░▀▀▀ ▄");
	} 
	
	//desenho para personalizar a empate
	public void empatou() {
		System.out.println(" █▀▀ █▀▄▀█ █▀▀█ █▀▀█ ▀▀█▀▀ █▀▀ █\r\n"
						 + " █▀▀ █░▀░█ █░░█ █▄▄█ ░░█░░ █▀▀ ▀\r\n"
						 + " ▀▀▀ ▀░░░▀ █▀▀▀ ▀░░▀ ░░▀░░ ▀▀▀ ▄");
	}

}
