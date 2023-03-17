import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] side = new int[3];
		int max_side, max_side_idx, shortsum;
		
		while(true) {
			
			max_side = 0; max_side_idx = -1; shortsum = 0;
			for (int i = 0; i < 3; i++) {
				side[i] = sc.nextInt();
				
				if (max_side < side[i]) {
					max_side = side[i];
					max_side_idx = i;
				}
			}
				
			// termination condition
			if (side[0] == 0 && side[1] == 0 && side[2] == 0)
				return;
			
			for (int i = 0; i < 3; i++) {
				if (i != max_side_idx)
					shortsum += Math.pow(side[i], 2);
			}
			
			if (shortsum == Math.pow(side[max_side_idx], 2))
				System.out.println("right");
			else
				System.out.println("wrong");	
		}
	}
}
