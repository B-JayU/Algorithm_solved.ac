import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N, M;
		
		N = sc.next();
		M = sc.next();
		
		if (N.length() != M.length()) {
			System.out.println("0");
			return;
		}
		
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(i) != M.charAt(i)) {
				System.out.println("0");
				return;
			}	
		}
		
		System.out.println("1");
	}

}
