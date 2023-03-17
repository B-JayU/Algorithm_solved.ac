import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int prob = sc.nextInt();
		int[] check = new int[prob];
		int[] score = new int[prob];
		int total = 0;
		
		for (int i = 0; i < prob; i++) 
			check[i] = sc.nextInt();
		
		if (check[0] == 1) {
			score[0] = 1;
			total++;
		}
		else
			score[1] = 0;
		
		for (int i = 1; i <prob; i++) {
			if (check[i] == 0)
				score[i] = 0;
			else {
				score[i] = score[i-1]+1;
				total += score[i];
			}
				
		}
		
		System.out.println(total);
		
		
	}

}
