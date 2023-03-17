import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int subjectCnt = sc.nextInt();
		int max = 0, sum = 0;
		
		for (int i = 0; i < subjectCnt; i++) {
			int score = sc.nextInt();
			if (score > max)
				max = score;
			sum += score;
		}
		
		double result = (double)sum / max * 100 / subjectCnt;
		
		System.out.printf("%.2f", result);
		
		
	}

}
