import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		int b = num % 10;
		
		if (b != 0) {
			sum += b;
			num /= 10;
		}else {
			sum += 10;
			num /= 100;
		}
		
		sum += num;
		
		System.out.println(sum);
	}

}
