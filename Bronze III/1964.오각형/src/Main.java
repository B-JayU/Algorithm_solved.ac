import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(pentagon(n));
		
	}
	
	public static int pentagon(int n) {
		
		if (n==1)
			return 5;
		else {
			return (pentagon(n-1) + 3*n + 1)%45678;
		}
	}
}
