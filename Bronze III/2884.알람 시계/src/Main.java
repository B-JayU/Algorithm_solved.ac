import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (h == 0) {
			if (m < 45)
				h = 24;
		}
		
		if (m < 45) {
			m += 60;
			m -= 45;
			h--;
		}else {
			m -= 45;
		}
		
		System.out.println(h + " " + m);
	}

}
