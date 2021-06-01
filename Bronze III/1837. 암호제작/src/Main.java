import java.util.Scanner;

public class Main {

	public static boolean[] isprime(int num) { // 1~ parameter 까지의 숫자가 소수 인지 판별하기
		boolean[] prime = new boolean[num];
		for (int i = 1; i < prime.length; i++) {
			prime[i] = true;
		}
		prime[1] = false; // 1은 소수가 아님
		
		for (int i = 2; i < Math.sqrt(num); i++) {
			
		}
		
		// 에라토스테네스의 체
		for (int i = 2; i < num; i++) {
			for (int j =2; j < Math.sqrt(num); j++) {
				if (i != j && i % j == 0)
					prime[i] = false;
			}
		}
		return prime;
	}
	
	
	public static boolean isdivided(String pass, int num) {
		int p = 0;
		
		for (int i = 0; i<pass.length(); i++) {
			p = (p*10 + (pass.charAt(i)-'0'))%num;
		}
		
		if (p == 0)
			return true;
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String password = sc.next();
		int k = sc.nextInt();
		boolean[] prime = isprime(k);
		
		for (int i = 2; i < k; i++) {
			
			if (prime[i] && isdivided(password, i)) {
				System.out.println("BAD " + i);
				return;
			}
		}
		
		System.out.println("GOOD");
	}
	
	

}
