import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int l = sc.nextInt();
		
		int result = Math.min((w/l) * (h/l), n);
		
		System.out.println(result);
	}

}
