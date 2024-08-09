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
			System.out.println(l2.apresentar());
			
		} else setAprovada(false);
			setDesafiado(null);
			setDesafiante(null);
			
	}
	
		public void Lutar() {
		
			if (getAprovada()) {

			getDesafiado().apresentar();
			getDesafiante().apresentar();
			
			int vencedor = random.nextInt(2);
			
			switch(vencedor) {
				case 0:
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1:
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2:
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
				default:
					System.out.println("Erro na aplicação.");
					break;
			}

		} else System.out.println("A luta não foi aprovada!");
	}
	
	
	
}
