import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] expr = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String octal = sc.next();
			int itr = octal.length();
			int sum = 0;
			
			if (octal.compareTo("#") == 0)
				return;
			
			for (int i = itr-1; i >=0; i--) {
				char c = octal.charAt(itr-1-i);
				int index= -1;
				
				for (int j = 0; j < expr.length; j++) {
					if (c == expr[j]) {
						index = j;
						break;
					}
				}
				
				if (index == 8)
					index = -1;
				
				sum += index * Math.pow(8, i);
			}
			System.out.println(sum);
		}
	}

}
