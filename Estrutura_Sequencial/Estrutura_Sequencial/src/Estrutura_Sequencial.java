import java.util.Locale;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
		
		double x = 10.015784; 
		
		String nome = "Eduardo" ;
		int idade = 24;
		double renda = 1400.00; 
		
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x );
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
}
