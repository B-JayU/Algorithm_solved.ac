import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int minCircle = (m<=k)?m:k;
		int minX = (n-m <= n-k)? n-m:n-k;
		
		System.out.println(minCircle + minX);
	}

}
