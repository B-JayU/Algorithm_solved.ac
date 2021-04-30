import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String revA = "";
		String revB = "";
		
		int resA, resB;
		
		for (int i = 2; i >= 0; i--) {
			revA += a.charAt(i);
			revB += b.charAt(i);
		}
		
		resA = Integer.parseInt(revA);
		resB = Integer.parseInt(revB);
		
		System.out.println((resA > resB)? resA:resB);
		
		
		
	}	

}
