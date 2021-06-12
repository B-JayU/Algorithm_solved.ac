import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n == 1) {
			System.out.println("1");
			return;
		}
		
		int comp = 1, power;
		while(comp<n) {
			comp *=2;
		}
		power = comp/2;
		
		System.out.println((n-power)*2);
	}

}
