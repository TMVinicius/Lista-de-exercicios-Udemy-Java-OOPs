package entities;

import services.Controlador;

public class ControleRemoto implements Controlador {

	public int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	public ControleRemoto(){
		setVolume(50);
		setLigado(false);
		setTocando(false);
	}
	
	private int getVolume() {
		return volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	private boolean getLigado() {
		return ligado;
	}
	
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);	
	}

	@Override
	public void abrirMenu() {
		System.out.println("\n" + "------MENU------");
		System.out.println("Está ligado: " + getLigado());
		System.out.println("Está tocando: " + getTocando());
		System.out.print("Volume: " + getVolume() + " ");
		 for (int i = 0; i < getVolume(); i += 10) {
			 System.out.print("|");
		 }
		 System.out.println(" ");
	}

	@Override
	public void fecharMenu() {
		System.out.println("\n" + "Fechando menu.");
	}

	@Override
	public void maisVolume() {
		if (getLigado() && getVolume() < 100) {
			setVolume(getVolume() + 5);
		}
		
	}

	@Override
	public void menosVolume() {
		if (getLigado() && getVolume() > 0) {
			setVolume(getVolume() -5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if (getLigado() && getVolume() > 0) {
			setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if (getLigado() && getVolume() == 0) {
			setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (getLigado() && !getTocando()) {
			setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (getLigado() && getTocando()) {
			setTocando(false);
		}
		
	}
	
	
	
}
