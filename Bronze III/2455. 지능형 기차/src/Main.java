import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int passenger = 0, max = 0;
		
		for (int i = 0; i <4; i++) {
			
			int takeOff = sc.nextInt();
			int takeOn = sc.nextInt();
			
			passenger -= takeOff;
			passenger += takeOn;
			
			if (passenger > max)
				max = passenger;
		}
		
		System.out.println(max);
	}

}
