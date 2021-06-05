import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		int quarter, dime, nickel, penny;
		
		for (int i = 0; i < t_case; i++) {
			int change = sc.nextInt();
			
			quarter = change / 25;
			change %= 25;
			
			dime = change / 10;
			change %= 10;
			
			nickel = change / 5;
			change %= 5;
			
			penny = change;
			
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
			
		}
	}
}
