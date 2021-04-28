import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		int cnt = sc.nextInt();
		int y = 0, m = 0;
		
		for (int i = 0; i < cnt; i++) {
			int time = sc.nextInt();
			
			y += (time/30 + 1) * 10;
			m += (time/60 + 1) * 15;
			
		}
		
		int cheaper = (y>m)? m:y;
		
		if (cheaper == y)
			result += "Y ";
		
		if (cheaper == m)
			result += "M ";
		
		System.out.println(result + cheaper);
	}

}
