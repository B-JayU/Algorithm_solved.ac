import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		
		for (int i = 0; i < t_case; i++) {
			
			int students = sc.nextInt();
			long candy = 0;
			for (int j = 0; j < students; j++) {
				candy += sc.nextLong();
				candy %= students;
			}
			
			if (candy == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
