import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Point[] p = new Point[n];
		
		// initailize
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		// sorting
		Arrays.sort(p, new Comparator<Point>() {
			
			public int compare(Point p1, Point p2) {
				if (p1.y == p2.y)
					return p1.x-p2.x;
				else
					return p1.y-p2.y;
			}
			
		});
		
		//output
		for (int i = 0; i< n; i++)
			System.out.println(p[i].x + " " + p[i].y);

		
		
	}

}
