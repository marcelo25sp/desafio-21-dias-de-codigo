package DesafioBarRelatorio;

public class Bar {

	private char genero;
	private int cerveja;
	private int refrigerante;
	private int espetinho;

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

}
