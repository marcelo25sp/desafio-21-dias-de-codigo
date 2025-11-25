package dia02;

import java.util.Locale;
import java.util.Scanner;

public class Ex001Soma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro valor para a soma: ");
		int valor1 = sc.nextInt();
		System.out.print("Entre com segundo valor para a soma: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma dos valores é" + soma);

		sc.close();

	}

}
