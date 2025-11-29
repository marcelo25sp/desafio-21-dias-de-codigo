package dia02;

import java.util.Locale;
import java.util.Scanner;

public class Ex003Troco {

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
		
		sc.close();

	}

}
