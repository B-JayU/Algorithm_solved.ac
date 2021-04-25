import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		int funcA1, funcA2;
		
		do {
			funcA1 = (number.charAt(0)-'0') * number.length();
			number = String.valueOf(funcA1);
			funcA2 = (number.charAt(0)-'0') * number.length();
			
		}while(funcA1 != funcA2);
		System.out.println("FA");
	}

}
