import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();
		String answer;
		int score; int conti;
		
		for (int i = 0; i < t_case; i++) {
			answer = sc.next();
			score = 0;
			conti = 0;
			
			int length = answer.length();
			for (int j = 0; j < length; j++) {
				
				if (answer.charAt(j) == 'O') {
					conti++;
					score += conti;
				}else if (answer.charAt(j) == 'X'){
					conti = 0;
				}
			}
			
			System.out.println(score);
		}
	}

}
