import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		int max = 0;
		int row=0, col=0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				
				num = sc.nextInt();
				
				if (num > max) {
					max = num;
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((row+1) + " " + (col+1));
		
	}

}
