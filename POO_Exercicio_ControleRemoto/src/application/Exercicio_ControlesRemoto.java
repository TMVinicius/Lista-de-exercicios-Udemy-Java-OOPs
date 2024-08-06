package application;

import entities.ControleRemoto;

public class Exercicio_ControlesRemoto {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.menosVolume();
		c.abrirMenu();
		
		c.play();
		c.ligarMudo();
		c.abrirMenu();
		
		
		c.pause();
		c.desligarMudo();
		c.desligar();
		c.abrirMenu();
		c.fecharMenu();
		
		
	}

}
