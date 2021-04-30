import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		int[] cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		
		
		for (int i = 0; i < 3; i++)
			result *= sc.nextInt();
		
		while(result >0) {
			cnt[result%10]++;
			result/=10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
		
	}

}
