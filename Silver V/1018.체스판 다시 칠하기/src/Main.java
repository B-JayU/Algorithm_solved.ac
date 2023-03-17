import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[n][m];
		int min = 64;
		
		//br.readLine();
		
		// arr 배열 초기화
		for (int i = 0; i < n; i++) {
			
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				
				if (str.charAt(j) == 'W')
					arr[i][j] = true;
				else 
					arr[i][j] = false;
			}
		}
		
		int start_x, start_y;
		boolean checker;
		int change = 0;
		
		for (int i = 0; i < n-7; i++) {
			for (int j = 0; j < m-7; j++) {
				start_x = i;
				start_y = j;
				
				checker = true;
				change = 0;
				
				for (int r = 0; r <8; r++) {
					for (int c = 0; c <8; c++) {
						
						if ((r+c) % 2 == 0 && arr[start_x+r][start_y+c] != checker)
							change++;
						
						if ((r+c) % 2 == 1 && arr[start_x+r][start_y+c] == checker)
							change++;
					}
				}
				
				if (min > change)
					min = change;
				
				checker = false;
				change = 0;
				
				for (int r = 0; r <8; r++) {
					for (int c = 0; c <8; c++) {
						
						if ((r+c) % 2 == 0 && arr[start_x+r][start_y+c] != checker)
							change++;
						
						if ((r+c) % 2 == 1 && arr[start_x+r][start_y+c] == checker)
							change++;
					}
				}
				
				if (min > change)
					min = change;
			}
		}
		
		System.out.println(min);
		
	}

}

