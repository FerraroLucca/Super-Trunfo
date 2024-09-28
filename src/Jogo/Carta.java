package Jogo;

public class Carta {
	
	//Atributos
	private int ataque;
	private int defesa;
	private int velocidade;
	
	//Contrutor
	public Carta(int ataque, int defesa, int velocidade) {
		super();
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
	}
	
	//Getters
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	
	//Setters
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
