package dia02;

import java.util.Locale;
import java.util.Scanner;

public class Ex002MediaIdades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a idade do usuário 1: ");
		int idade1 = sc.nextInt();
		System.out.print("Entre com a idade do usuário 2: ");
		int idade2 = sc.nextInt();
		System.out.print("Entre com a idade do usuário 3: ");
		int idade3 = sc.nextInt();
		
		double media = (double)(idade1 + idade2 + idade3) / 3.0;
		
		System.out.println();
		System.out.printf("A média das idades é %.2f anos%n", media);
		
		sc.close();
		
	}

}
