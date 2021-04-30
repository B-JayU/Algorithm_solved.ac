import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> remain = new ArrayList<Integer>();
		boolean check = false;
		
		for (int i = 0; i < 10; i++) {
			int num =sc.nextInt();
			
			if (remain.size() == 0) {
				remain.add(num % 42);
				continue;
			}
				
			
			for (int j = 0; j < remain.size(); j++) {
				if (remain.get(j) == num%42)
					check = true;
			}
			
			if (check == false) {
				remain.add(num%42);
		
			}
		
			check = false;
		
		}
		System.out.println(remain.size());
	}

}
