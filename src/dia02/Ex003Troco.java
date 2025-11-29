package dia02;

import java.util.Locale;
import java.util.Scanner;

public class Ex003Troco {

	/*
	 * Fazer um programa para calcular o troco no processo de pagamento de um
	 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
	 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
	 * pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
	 * mostrar o valor do troco a ser devolvido ao cliente.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o preço unitário do produto:(R$) ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		System.out.print("Valor recebido:(R$) ");
		double valorRecebido = sc.nextDouble();

		double valorTotal = (double) preco * quantidade;
		double troco = valorRecebido - valorTotal;

		System.out.println();
		System.out.printf("TROCO = R$ %.2f%n", troco);

		sc.close();

	}

}
