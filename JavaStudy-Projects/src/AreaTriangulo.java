import java.util.Scanner;

public class AreaTriangulo {
	
	//base * altura / 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int altura = sc.nextInt();
		sc.close();
		int area = base * altura/2;
		System.out.println("Area do tri: " + area);
	}
}
