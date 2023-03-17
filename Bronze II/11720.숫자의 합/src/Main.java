import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String numbering = sc.next();
		int sum = 0; int num;
		
		for (int i = 0; i < n; i++) {
			num = (int)numbering.charAt(i);
			sum += (num-48);
		}
		
		System.out.println(sum);
	}
}
