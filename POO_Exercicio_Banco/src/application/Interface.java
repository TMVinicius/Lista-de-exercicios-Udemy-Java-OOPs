package application;
import entities.ContaBanco;
public class Interface {

	public static void main(String[] args) {

		
		ContaBanco p1 = new ContaBanco(1234 , "Joao Pedro");
		ContaBanco p2 = new ContaBanco(9876, "Maria Joaquina");
		
		p1.abrirConta("CC");
		p2.abrirConta("CP");
		
		p1.sacar(50);
		p1.fecharConta();
		
		
		
		
		
		
		
		System.out.println(p1);
		
		System.out.println(p2);
		
	}

}
