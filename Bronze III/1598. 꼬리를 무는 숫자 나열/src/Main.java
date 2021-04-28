import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int dir_hor = Math.abs((a-1)/4-(b-1)/4);
		int dir_ver = Math.abs((a-1)%4-(b-1)%4);
		
		System.out.println(dir_hor + dir_ver);
	}

}
