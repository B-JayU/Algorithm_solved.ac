import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int tree_cnt = Integer.parseInt(st.nextToken());
		int need  = Integer.parseInt(st.nextToken());
		
		int[] ary = new int[tree_cnt];
		
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < tree_cnt; i++) {
			if (st.hasMoreTokens()) {
				ary[i] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(ary);
		
		int sum = 0, cur = tree_cnt-2;
		while(true) {
			sum = 0;
			
			for (int i = tree_cnt-1; i > cur; i--) {
				sum+= ary[i] - ary[cur];
			}
			
			if (sum < need)
				cur--;
			else
				break;
		}
		
		if (sum > need) {
			System.out.println(ary[cur] + (sum-need)/(tree_cnt-1-cur));
		}else {
			System.out.println(ary[cur]);
		}
	}
}
