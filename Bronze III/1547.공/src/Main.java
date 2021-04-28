import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int current = 1;
		int[] cup = new int[2];
		
		for (int i = 0; i < count; i++) {
			cup[0] = sc.nextInt();
			cup[1] = sc.nextInt();
			
			if (cup[0] == current || cup[1] == current) {
				current = cup[0]+cup[1] - current;
			}
		}
		
		System.out.println(current);
	}

}
