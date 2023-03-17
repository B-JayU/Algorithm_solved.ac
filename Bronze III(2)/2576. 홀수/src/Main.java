import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int min = 100;
		int sum = 0;
		boolean odd = false;
		
		for (int i = 0; i < 7; i++) {
			int num = sc.nextInt();
			
			
			if (num % 2 == 1) {
				odd = true;
				sum += num;
				if (num < min)
					min = num;
			}
		}
		
		if (odd) {
			System.out.println(sum);
			System.out.println(min);
		}else
			System.out.println("-1");
		
	}

}
