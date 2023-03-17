import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int sum = 0;
		int max=0; int min=0; int result=0;
		int[] level = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <4; i++) {
			level[i] = sc.nextInt();
			max = level[0];
			min = level[0];
			sum += level[i];
			
			if (max < level[i])
				max = level[i];
			if (min > level[i])
				min = level[i];
		}
		result = (max+min)-(sum-max-min);
		System.out.println(Math.abs(result));
	}
}
