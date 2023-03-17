import java.util.Scanner;

public class Main {

	static int m, n;
	static int map[][];
	static int turn = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[m][n];
		
		
		// Initialize map
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = 0;
			}
		}
		
		map[0][0] = 1;
		int current_x = 0;
		int current_y = 0;
		int cur_direction = 0; // (0->1->2->3)
		
		
		while(true) {
			
			// Termination Condition
			boolean east = check_go(current_x, current_y, 0);
			boolean south = check_go(current_x, current_y, 1);
			boolean west = check_go(current_x, current_y, 2);
			boolean north = check_go(current_x, current_y, 3);
			
			if (!east && !south && !west && !north) {
				System.out.println(turn);
				return;
			}
			
			if (east && cur_direction == 0) 
				move(current_x, ++current_y);
			else if (south && cur_direction == 1) {
				move(++current_x, current_y);
			}
			else if (west && cur_direction == 2) {
				move(current_x, --current_y);
			}
			else if(north && cur_direction == 3) {
				move(--current_x, current_y);
			}
			else {
				cur_direction = (cur_direction+1)%4;
				turn++;
			}
		}
		
	}

	public static  boolean check_go(int x, int y, int dir) {
		
		switch(dir) {
			case 0:
				y++;
				if (y == n || map[x][y] == 1)
					return false;
				break;
			case 1:
				x++;
				if (x == m || map[x][y] == 1)
					return false;
				break;
			case 2:
				y--;
				if (y == -1 || map[x][y] == 1)
					return false;
				break;
			case 3:
				x--;
				if (x == -1 || map[x][y] == 1)
					return false;
				break;
		}
		return true;
	}
	
	public static void move(int x, int y) {
		
		map[x][y] = 1;
	}
}

