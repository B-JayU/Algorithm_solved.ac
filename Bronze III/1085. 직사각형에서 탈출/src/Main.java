import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minV = Math.min(x, y);
		int minV2 = Math.min(w-x,  h-y);
		
		System.out.println(Math.min(minV, minV2));
	}

}
