import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger key = sc.nextBigInteger();
		int l = sc.nextInt();
		
		for (int i = 2; i < l; i++) {
			if (isPrime(i)) {
				if ( (key.mod(BigInteger.valueOf(i))).equals(BigInteger.ZERO) ) {
					System.out.println("BAD " + i);
					return;
				}
			}else {
				continue;
			}
		}
		
		System.out.println("GOOD");
	}
	
	public static boolean isPrime(int n) {
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
			
		}
		return true;
	}

}
