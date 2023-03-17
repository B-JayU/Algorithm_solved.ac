import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisor.add(i);
			}
				
		}
		
		if (divisor.size() < k)
			System.out.println("0");
		else
			System.out.println(divisor.get(k-1));
		
	}
}
