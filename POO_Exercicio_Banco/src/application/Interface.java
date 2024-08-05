package application;
import entities.ContaBanco;
public class Interface {

	public static void main(String[] args) {

		
		ContaBanco p1 = new ContaBanco(1234 , "Jo�o");
		ContaBanco p2 = new ContaBanco(9876, "Maria");
		
		p1.abrirConta("CC"); // Por escolher Conta Corrente(CC), o cliente Jo�o ganha R$ 50,00 inicialmente em sua conta e "Status da conta true".
		p1.sacar(50); // Teste para funcionamento do m�todo sacar, zerando a conta de Jo�o e possibilitando ele a fechar sua conta.
		p1.sacar(100); // Teste para funcionamento do saldo insuficiente no m�todo sacar, pois n�o � poss�vel sacar sem saldo em conta.
		p1.fecharConta(); // Teste para finalizar a conta, com status da conta atualizado para false. 
		
		System.out.println(p1);
		
		
		p2.abrirConta("CP"); // Conta Poupan�a (CP) que incialmente Maria ganha do banco R$ 150,00 e "Status da conta: true".
		p2.depositar(870); // Teste para dep�sito;
		p2.pagarMensal(); // Teste para abater o valor da mensalidade em conta CP equivalente a R$ 20,00.
		p2.fecharConta(); // Tentativa inv�lida de fechar a conta por possuir saldo na mesma.
		
		System.out.println(p2);
		
		
		
		
		
	}

}
