import java.util.Scanner;

class point{
	int x;
	int y;
	
	public point() {
		x = 0;
		y = 0;
	}
}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		point[] square = new point[3];
		
		
		int max_x = 0, min_x = 1000;
		int max_y = 0, min_y = 1000;
		int sum_x = 0, sum_y = 0;
		
		for (int i = 0; i < 3; i++) {
			
			square[i] = new point();
			square[i].x = sc.nextInt();
			sum_x += square[i].x;
			
			if (square[i].x > max_x)
				max_x = square[i].x;
			if (square[i].x < min_x)
				min_x = square[i].x;
			
			square[i].y = sc.nextInt();
			sum_y += square[i].y;
			
			if (square[i].y > max_y)
				max_y = square[i].y;
			if (square[i].y < min_y)
				min_y = square[i].y;
		
		}
		
		if (sum_x - max_x - min_x == max_x)
			System.out.print(min_x + " ");
		else 
			System.out.print(max_x + " ");
		
		if (sum_y - max_y - min_y == max_y)
			System.out.println(min_y);
		else 
			System.out.println(max_y);
		
	}

}
