import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static boolean PrimeChecker(int num) {
		
		for (int i = 2; i < (int)Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcm=1, lcm=1;
		boolean isPrimeA = PrimeChecker(a), isPrimeB = PrimeChecker(b);
		
		// 두 수가 소수일 때, 
		if (isPrimeA && isPrimeB) {
			lcm = a * b;
		}
		else if(isPrimeA && !isPrimeB) {
			if (b % a == 0) {
				gcm = a;
				lcm = b;
			}else {
				lcm = a*b;
			}

		}
		else if(!isPrimeA && isPrimeB) {
			if (a % b == 0) {
				gcm = b;
				lcm = a;
			}else {
				lcm = a*b;
			}
		}
		else {	// 둘 다 소수가 아니면
			
			int smaller = (a<b)? a:b;
			int bigger = (a<b)? b:a;
			int i;
			
			//int check = (int)Math.sqrt(smaller);
			while(true) {
				for (i = 2; i <= smaller; i++) {
					if (bigger%i == 0 && smaller%i == 0) {
						gcm *= i;
						bigger /= i;
						smaller /= i;
						break;
					}
				}
				
				if (i > smaller) {
					lcm = gcm * bigger * smaller;
					break;
				}
			}	
		}
		
		System.out.println(gcm);
		System.out.println(lcm);
	}

}
