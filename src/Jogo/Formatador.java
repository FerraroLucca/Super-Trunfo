package Jogo;

public class Formatador {
	
	//por uma questão de estética decidimos optar por limpar a tela a cada rodada, para ficar mais facil o entendimento
	public void pulaLinha() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	
	//esse método de processamento é para manter na tela as informações antes do metodo acima limpar a tela
	public void processamento() {
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}

}
