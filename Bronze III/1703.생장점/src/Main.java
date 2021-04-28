import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int age = sc.nextInt();
			int branch = 1;
			
			if (age == 0)
				return;
			
			for (int i = 0; i < age; i++) {
				int spl_factor = sc.nextInt();
				int prun = sc.nextInt();
				
				branch = branch * spl_factor - prun;
			}
			
			System.out.println(branch);
		}
	}

}
