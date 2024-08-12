package entities;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (getPeso() < 66.0) {
			this.categoria = "Inv�lido";
		} else if (getPeso() <= 76.0) {
			this.categoria = "peso Leve";
		} else if (getPeso() <= 86.0) {
			this.categoria = "peso M�dio";
		} else if (getPeso() <= 109.0) {
			this.categoria = "peso Pesado";
		} else
			this.categoria = "Inv�lido";
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public String apresentar() {
		return "\n" + "Ele � " + getNacionalidade() + ", de altura " + getAltura() + " m, com " + getPeso()
				+ " kg, vindo da categoria " + getCategoria() + " com " + getVitorias() + " vit�rias, " + getDerrotas()
				+ " derrotas e " + getEmpates() + " empates, recebam ele " + getNome() + " !!!";
	}

	public String status() {
		return "\n" + "Nome: " + getNome() + "\n" + "Vit�rias: " + getVitorias() + "\n" + "Derrotas: " + getDerrotas()
				+ "\n" + "Empates: " + getEmpates() + "\n";
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
		System.out.println("O " + getNome() + " � o vencedor do confronto!");
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

}
