package DesafioBarRelatorio;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Genero:(M/F) ");
		char genero = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		int cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int refrigerantes = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();
		
		Bar cliente = new Bar(genero, cervejas, refrigerantes, espetinhos);

		sc.close();
	}

}
