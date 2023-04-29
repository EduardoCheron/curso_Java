import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Z;
		String s1, s2, s3;
		
		Z = sc.next();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println("Você digitou: " + Z);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
