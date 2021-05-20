import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum, temp;
		boolean search = false;
		
		for (int i = 1; i < n; i++) {
			
			sum = i;
			temp = i;
			
			do {
				sum += temp % 10;
				temp /= 10;
			}while(temp > 0);
			
			if (sum == n) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println("0");
		
	}

}
