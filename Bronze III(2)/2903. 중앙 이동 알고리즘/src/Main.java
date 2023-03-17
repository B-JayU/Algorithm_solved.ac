import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int step = sc.nextInt();
		
		int row = 1;
		int col = 1;
		int dot=1;
		
		for (int i = 1; i <= step; i++) {
			row *= 2;
			col *= 2;
			dot = (row+1)*(col+1);
		}
		
		System.out.println(dot);
	}

}
