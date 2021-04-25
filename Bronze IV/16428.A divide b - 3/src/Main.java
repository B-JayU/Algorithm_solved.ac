import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger div, remainder;
		
		if (b.compareTo(BigInteger.ZERO) < 0) {
			div = a.divide(b);
			remainder = a.remainder(b);
			
			while(remainder.compareTo(BigInteger.ZERO) < 0) {
				div.add(BigInteger.ONE);
				remainder.subtract(b);
			}
		}else {
			div = a.divideAndRemainder(b)[0];
			remainder = a.mod(b);
		}
		
		
		System.out.println(div);
		System.out.println(remainder);
		
	}

}
