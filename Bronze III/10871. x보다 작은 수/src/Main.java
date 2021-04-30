import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int stdd = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int num = sc.nextInt();
			
			if (num < stdd)
				System.out.print(num+ " ");
		}
		
		System.out.println();
	}

}
