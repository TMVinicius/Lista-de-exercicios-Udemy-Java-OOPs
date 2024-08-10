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
			System.out.println("Descoberto!");
		}
				
			
	}
	
		public void Lutar() {
		
			if (getAprovada()) {

			System.out.println(getDesafiado().apresentar() + "\n");
			System.out.println(getDesafiante().apresentar() + "\n");
			
			int vencedor = random.nextInt(3);
			
			System.out.println(vencedor);
			switch(vencedor) {
				case 0:
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println("Ambos empataram");
					break;
				case 1:
					desafiado.ganharLuta();
					desafiante.perderLuta();
					System.out.println(desafiado.getNome() + " é o vencedor do confronto!");
					break;
				case 2:
					desafiado.perderLuta();
					desafiante.ganharLuta();
					System.out.println(desafiante.getNome() + "é o vencedor do confronto!");
					break;
				default:
					System.out.println("Erro na aplicação.");
					break;
			}

		} else System.out.println("A luta não foi aprovada!");
	}
	
	
	
}
