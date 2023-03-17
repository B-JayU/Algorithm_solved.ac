import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int max, index=0;
		
		for (int i = 0; i < 9; i++)
			num[i] = sc.nextInt();
		
		max = num[0];
		for (int i = 1; i < 9; i++) {
			if (max < num[i]) {
				max = num[i];
				index = i;
			}
				
		}
		
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
