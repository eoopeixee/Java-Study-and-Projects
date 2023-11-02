import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int nr = sc.nextInt();
		sc.close();
		
		if(nr % 2 == 0) {
			System.out.print(nr + " é par");
		} else {
			System.out.print(nr + " é impar");
		}
		
	}
}
