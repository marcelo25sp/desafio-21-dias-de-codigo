package DesafioBarRelatorio;

public class Bar {

	private char genero;
	private int cerveja;
	private int refrigerante;
	private int espetinho;

	public Bar(char genero, int cerveja, int refrigerante, int espetinho) {
		this.genero = genero;
		this.cerveja = cerveja;
		this.refrigerante = refrigerante;
		this.espetinho = espetinho;
	}

	public char getGenero() {
		return genero;
	}

	public int getCerveja() {
		return cerveja;
	}

	public int getRefrigerante() {
		return refrigerante;
	}

	public int getEspetinho() {
		return espetinho;
	}

	public double couvert() {
		return 4.0;
	}

	public double consumo() {
		return cerveja + refrigerante + espetinho;
	}

	public double ingresso() {
		if (genero == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	public double valorTotal() {
		return couvert() + consumo() + ingresso();
	}

	public String exibirRelatorio() {
		return String.format("Consumo = R$ %.2f \nCouvert = R$ %.2f \nIngresso: R$ %.2f\n", consumo(), couvert(), ingresso());
	}

}
