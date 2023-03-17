import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		int n, sum = 0;
		
		for (int i = 0; i < t_case; i++) {
			
			n = sc.nextInt();
			sum = 0;
			
			for (int k = 1; k <=n; k++) {
				
				sum += k * T(k+1);
			}
			System.out.println(sum);
		}
	}
	
	public static int T(int n) {
		
		return n*(n+1)/2;
	}

}
