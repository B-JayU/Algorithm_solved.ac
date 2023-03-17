import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min, max;
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		min = num[0]; max = num[0];
		for (int i = 1; i <n; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		}
		
		System.out.println(min + " " + max);

	}
}
