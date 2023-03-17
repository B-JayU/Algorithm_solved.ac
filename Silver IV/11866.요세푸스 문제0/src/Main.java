import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> circle = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <=n; i++)
			circle.add(i);
		
		int start = 0;
		int rem;
		sb.append("<");
		while(circle.size() != 0) {
			start = (start + (k-1))%circle.size();
			rem = circle.remove(start);
			
			if (circle.size()==0)
				sb.append(rem + ">");
			else
				sb.append(rem + ", ");
		}
		
		System.out.println(sb.toString());
		
	}

}
