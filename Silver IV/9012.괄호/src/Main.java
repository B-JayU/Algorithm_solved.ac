import java.util.Scanner;

public class Main {

	public static void deterVps(String ps) {
		
		int cnt = 0;
		for (int i = 0; i < ps.length(); i++) {
			
			if (ps.charAt(i) =='(')
				cnt++;
			else if(cnt == 0){
				System.out.println("No");
				return;
			}else {
				cnt--;
			}
		}
		
		if (cnt == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String ps;
		
		for (int i = 0; i <n; i++) {
			ps = sc.next();
			deterVps(ps);
		}
	}
}
