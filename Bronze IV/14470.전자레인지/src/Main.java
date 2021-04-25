import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempA = sc.nextInt();
		int tempB = sc.nextInt();
		int time = 0;
		
		int timeC = sc.nextInt();
		int timeD = sc.nextInt();
		int timeE = sc.nextInt();
		
		if (tempA < 0) {
			time += timeC * (-tempA);
			tempA = 0;
		}
		
		if (tempA == 0)
			time += timeD;
		
		time += timeE * (tempB-tempA);
		
		System.out.println(time);
	}

}
