import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int cnt = sc.nextInt();
			
			BigInteger sum = BigInteger.ZERO;
			for (int j = 0; j < cnt; j++) {
				BigInteger num = sc.nextBigInteger();
				sum = sum.add(num);
			}
			
			int det = sum.compareTo(BigInteger.ZERO);
			
			if (det == 0)
				System.out.println("0");
			else if(det < 0)
				System.out.println("-");
			else
				System.out.println("+");
			
		}
	}

}
