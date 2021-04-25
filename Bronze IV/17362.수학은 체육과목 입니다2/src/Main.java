import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n <= 5) {
			System.out.println(n);
			return;
		}
		
		int result;
		while(n > 5) {
			n = n-8;
		}
		
		if (n > 0)
			result = n;
		else
			result = 2-n;
		
		System.out.println(result);
	}

}
