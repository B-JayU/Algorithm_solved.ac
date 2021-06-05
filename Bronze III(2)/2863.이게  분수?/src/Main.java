import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = 4;
		double[] div = new double[size];
		double result_max, result;
		int tries = 0;
		
		div[0] = sc.nextInt();
		div[1] = sc.nextInt();
		div[3] = sc.nextInt();
		div[2] = sc.nextInt();
		
		int start = size;
		
		result_max = div[start%4]/div[(start+3)%4]+ div[(start+1)%4]/div[(start+2)%4];
		
		for (int i = start-1; i > 0; i--) {
			
			result = div[i%4]/div[(i+3)%4]+ div[(i+1)%4]/div[(i+2)%4];
			
			if (result > result_max) {
				result_max = result;
				tries = start-i;
			}
				
		}
		System.out.println(tries);
		
	}

}
