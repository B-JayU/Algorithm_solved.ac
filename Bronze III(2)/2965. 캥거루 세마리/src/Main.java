import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] kangaroo = new int[3];
		int dist_L = 0, dist_R = 0;
		
		for (int i = 0; i < 3; i++) 
			kangaroo[i] = sc.nextInt();
		
		dist_L = kangaroo[1]-kangaroo[0];
		dist_R = kangaroo[2]-kangaroo[1];
		
		if (dist_L > dist_R)
			System.out.println(dist_L-1);
		else
			System.out.println(dist_R-1);
	}

}
