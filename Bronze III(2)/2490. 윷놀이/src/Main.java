import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int front = 0, back = 1;
		int[] yut = new int[2];
		
		for (int i = 0; i < 3; i++) {
			
			for (int y = 0; y < 2; y++) {
				yut[y] = 0;
			}
			
			for (int y = 0; y < 4; y++) {
				int yutgarak = sc.nextInt();
				
				if (yutgarak == front)
					yut[front]++;
				else
					yut[back]++;
			}
			
			if (yut[front]==1 && yut[back]==3)
				System.out.println("A");
			else if (yut[front]==2 && yut[back]==2)
				System.out.println("B");
			else if (yut[front]==3 && yut[back]==1)
				System.out.println("C");
			else if (yut[front]==4)
				System.out.println("D");
			else if (yut[back]==4)
				System.out.println("E");
		}
		
	}
}
