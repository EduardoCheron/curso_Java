import java.util.Scanner;

public class for_exercicio {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("deseja somar quantos números ? ");
	
	int x = sc.nextInt();
	int soma = 0;
	System.out.println("Digite quais números deseja somar:");
	
	for (int n=0; n < x ; n ++ ) {
		int z = sc.nextInt();
		soma += z;
	}
	System.out.println("total da soma: " + soma);
	
	
	sc.close();
	}	

}
	