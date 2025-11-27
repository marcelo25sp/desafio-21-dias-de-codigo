package DesafioBarRelatorio;

public class Bar {

	// atributos do programa
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

	// métodos getters
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
	

	// método que retorna um valor nulo caso o usuário tenha um consumo maior que R$ 30.00
	public double couvert() {
		if (consumo() >= 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	//método que retorna o valor total do consumo
	public double consumo() {
		return (cerveja * 5.0) + (refrigerante * 3.0) + (espetinho * 7.0);
	}

	// método que retorna um valor de acordo com o genero do cliente
	public double ingresso() {
		if (genero == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	// método que retorna o valor total a pagar
	public double valorTotal() {
		return couvert() + consumo() + ingresso();
	}

	
	public String exibirRelatorio() {
		return String.format("Consumo = R$ %.2f \nCouvert = R$ %.2f \nIngresso =  R$ %.2f\n", consumo(), couvert(),
				ingresso());
	}

}
