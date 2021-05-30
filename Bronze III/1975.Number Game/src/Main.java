import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();
		
		for (int i = 0; i < t_case; i++) {
			
			int summation = 0;
			int N = sc.nextInt();
			
			for (int b = 2; b <= N; b++) {	
				int num = N;
				int cnt = 0;
				while(true) {
					if (num % b == 0) {
						cnt++;
						num /= b;
					}else
						break;
				}
				
				summation += cnt;
			}
		
			System.out.println(summation);
		}
	}

}
