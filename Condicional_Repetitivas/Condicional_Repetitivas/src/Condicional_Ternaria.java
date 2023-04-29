import java.util.Scanner;
public class Condicional_Ternaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco > 100.0) ? preco * 0.1 : preco * 0.05;
		double valor_com_desconto = preco - desconto;
		System.out.println("Valor com Desconto : " + valor_com_desconto);
		
		sc.close();
	
	
	}
}
