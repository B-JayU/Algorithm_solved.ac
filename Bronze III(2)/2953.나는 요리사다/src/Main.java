import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int winner = 0;
		int score = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			score = 0;
			
			for (int j = 1; j <= 4; j++) {
				score += sc.nextInt();
			}
			
			if (score > max) {
				max = score;
				winner = i;
			}
		}
		
		System.out.println(winner + " " + max);
	}

}
