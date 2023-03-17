import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();
		int car;
		int forbid = 0;
		
		for (int i = 0; i< 5; i++) {
			car = sc.nextInt();
			
			if (car == day%10)
				forbid++;
			
		}
		
		System.out.println(forbid);
	}

}
