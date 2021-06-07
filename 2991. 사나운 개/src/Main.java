import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int attack;
		
		for (int i = 0; i < 3; i++) {
			
			int haborA = sc.nextInt();
			int haborB = haborA;
			
			attack = 0;
			
			if ((haborA % (a+b)) != 0) {
				haborA = haborA%(a+b);
				
				if (haborA <= a)
					attack++;
			}
			
			if ((haborB % (c+d)) != 0) {
				haborB = haborB%(c+d);
				
				if (haborB <= c)
					attack++;
			}
		
			System.out.println(attack);
		}
		
		
		
	}

}
