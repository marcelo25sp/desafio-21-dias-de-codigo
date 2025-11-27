package DesafioBarRelatorio;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres.
	 * Cada cerveja custa 5 reais, cada refrigerante 3 reais e cada espetinho custa
	 * 7. Além disso, o bar cobra uma taxa de couvert artístico no valor de 4 reais,
	 * porém, se o valor gasto com consumo for superior a 30 reais, o couvert
	 * artístico não é cobrado. Fazer um programa para ler os seguintes dados de um
	 * cliente do bar: sexo (F ou M), quantidade de cervejas, refrigerantes e
	 * espetinhos consumidos. O programa deve então mostrar um relatório com a conta
	 * a ser paga pelo cliente
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// entrada de dados do usuário
		System.out.print("Genero:(M/F) ");
		char genero = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		int cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int refrigerantes = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();

		// instancia da classe Bar
		Bar cliente = new Bar(genero, cervejas, refrigerantes, espetinhos);

		// saída de dados e relatório da conta a pagar
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("-----------");
		System.out.println(cliente.exibirRelatorio());
		System.out.printf("Valor a pagar: R$ %.2f%n", cliente.valorTotal());

		sc.close();
	}

}
