import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double L = sc.nextInt();
		double s = Math.pow(L, 2) * Math.sqrt(3) / 4;
		
		System.out.println(s);
			
	}
} 