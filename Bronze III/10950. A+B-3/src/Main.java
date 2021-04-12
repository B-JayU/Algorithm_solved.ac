import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		while(sc.hasNextInt()) {
			
			int item1 = sc.nextInt();
			int item2 = sc.nextInt();
			
			if (item1 == 0 && item2 == 0)
				break;
			
			System.out.println(item1 + item2);
		}
	}

}

