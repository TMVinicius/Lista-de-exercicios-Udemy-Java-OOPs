package entities;
import java.util.Random;
public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada = false;
	
	Random random = new Random();

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean getAprovada() {
		return aprovada;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1,Lutador l2 ) {
		if (l1.getCategoria() == l2.getCategoria() && (l1) != (l2)) {
			setAprovada(true);
			setDesafiado(l1);
			setDesafiante(l2);
			
		} else {
			setDesafiado (null);
			setDesafiante(null);
		}
				
			
	}
	
		public void Lutar() {
		
			if (getAprovada()) {

			System.out.println(getDesafiado().apresentar() + "\n");
			System.out.println(getDesafiante().apresentar() + "\n");
			
			int vencedor = random.nextInt(4);
			
			if (desafiado.getPeso() > desafiante.getPeso()) {
				switch(vencedor) {
				case 0, 1:
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				
				case 2:
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
				case 3:
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println("A luta terminou em empate!");
					break;
				}
			} else if (desafiado.getPeso() < desafiado.getPeso()) {
				switch(vencedor) {
				case 0,1:
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
				case 2:
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 3:
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println("A luta terminou em empate!");
					break;
				}
			} else { 
				switch (vencedor) {
				case 0:
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 1:
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
				case 2,3:
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println("A luta terminou em empate!");
				}	
			}
		} else System.out.println("A luta não foi aprovada!");
	}
	
	
	
}
