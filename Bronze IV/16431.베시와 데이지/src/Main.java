import java.util.Scanner;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] position = new int[3][2];
		int bessie, daisy;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				position[i][j] = sc.nextInt();
			}
		}
		 
		daisy = Math.abs(position[2][0]-position[1][0]) + 
				Math.abs(position[2][1]-position[1][1]);
		
		bessie = Math.max(Math.abs(position[2][0]-position[0][0]), Math.abs(position[2][1]-position[0][1]));
		
		if (daisy < bessie){
			System.out.println("daisy");
		}else if(daisy > bessie) {
			System.out.println("bessie");
		}else {
			System.out.println("tie");
		}

	}

}
