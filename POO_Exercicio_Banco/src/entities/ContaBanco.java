package entities;

public class ContaBanco {

	public int conta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(int conta, String dono) {
		setConta(conta);
		setDono(dono);
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tp) {
		if (tp == "CC") {
			setTipo(tp);
			setSaldo(50);
			System.out.println("Conta de " + getDono() + " aberta com sucesso!");
			setStatus(true);
		} else if (tp == "CP") {
			setTipo(tp);
			setSaldo(150);
			System.out.println("Conta de " + getDono() + " aberta com sucesso!");
			setStatus(true);
		} else
			System.out.println("Digite um tipo de conta válida: CC ou CP.");

	}

	public void fecharConta() {
		if (!getStatus()) {
			System.out.println("Conta já fechada!");
		} else if (getSaldo() > 0) {
			System.out.println("Não é possível fechar com saldo em conta.");
		} else {
			setStatus(false);
			System.out.println("Conta de " + getDono() + " fechada com sucesso!");
		}
	}

	public void depositar(double dep) {
		if (getStatus()) {
			setSaldo(getSaldo() + dep);
		} else
			System.out.println("Não é possível depositar com a conta fechada.");
	}

	public void sacar(double dep) {
		if (getStatus() && dep <= getSaldo()) {
			setSaldo(getSaldo() - dep);
			System.out.println("Saque de R$ " + (String.format("%.2f", dep)) + " realizado com sucesso!"  );
		} else if (dep > getSaldo()){
			System.out.println("Saldo insuficiente para saque!");
		}else
			System.out.println("Não é possível sacar com a conta fechada.");
	}

	public void pagarMensal() {
		if (getTipo().equals("CC")) {
			setSaldo(getSaldo() - 10);
		} else if (getTipo().equals("CP")) {
			setSaldo(getSaldo() - 20);
		} else
			System.out.println("Não há mensalidade a pagar com conta fechada");
	}

	public String toString() {
		return   "---------------------" + "\n" + "Número da conta: " + getConta() + "\n" + "Tipo da conta: "
				+ getTipo() + "\n" + "Dono da conta: " + getDono() + "\n" + "Saldo em conta: " + getSaldo() + "\n"
				+ "Status da conta: " + getStatus() + "\n";

	}
}
