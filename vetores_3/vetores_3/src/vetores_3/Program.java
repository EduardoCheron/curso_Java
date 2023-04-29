package vetores_3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int b;
		double soma, media;
		
		System.out.println("Quantos números você vai digitar? ");
		b = sc.nextInt();
		
		double [] vetor = new double[b];
		
		for (int i = 0; i < b; i++) {
			System.out.println("Digite um número: ");
			vetor [i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.printf("Valores digitados: ");
		for (int i = 0; i < b; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		 soma = 0.0;
		for (int i = 0; i < b; i++) {
			soma += vetor [i];
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);

		 media = soma / b;
		System.out.printf("MEDIA =  %.2f", media);
		
		sc.close();
	}

}
