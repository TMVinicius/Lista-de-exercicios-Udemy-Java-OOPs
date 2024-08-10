package application;

import entities.Lutador;
import entities.Luta;
public class ExercicioUFC {

	public static void main(String[] args) {
		
		Lutador[] L = new Lutador[6];

		L[0] = new Lutador("Charles Olivera", "Brasileiro", 1.78, 70.0, 34, 9, 0);
		L[1] = new Lutador("Dustin Poirier", "Americano", 1.75, 70.0, 29, 7, 3);
		L[2] = new Lutador("Israel Adesanya", "Nigeriano", 1.93, 84, 24, 3, 0);
		L[3] = new Lutador("Robert Whittaker", "Australiano", 1.83, 84, 25, 1, 0);
		L[4] = new Lutador("Jon Jones", "Americano", 1.93, 109, 27, 1, 0);
		L[5] = new Lutador("Stipe Miocic", "Americano", 1.93, 109, 20, 4, 0);

		Luta l = new Luta();
		
		l.marcarLuta(L[0], L[1]);
		l.Lutar();
		System.out.println(l.getDesafiado().status() + "\n" + l.getDesafiante().status());
		
	}
}
