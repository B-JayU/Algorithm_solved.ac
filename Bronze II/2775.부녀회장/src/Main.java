import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		for (int i = 0; i < t_case; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(p(k,n));
		}
	}
	
	public static int p(int k, int n) {
		
		int sum = 0;
		
		if (k == 0) {
			return n;
		}
		
		for (int i = 1; i <=n; i++) {
			sum += p(k-1, i);
		}
		
		return sum;
	}

}
