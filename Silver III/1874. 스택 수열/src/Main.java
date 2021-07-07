import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n];
		int[] stack = new int[n];
		
		for (int i = 0; i< n; i++)
			seq[i] = Integer.parseInt(br.readLine());
		
		int cur = 1, idxSeq = 0, top=-1;
		
		while(!(cur >n && idxSeq >=n)) {
			if (seq[idxSeq] >= cur) {
				
				stack[++top] = cur;
				cur++;
				sb.append("+\n");
				
			} else {
				if (seq[idxSeq] == stack[top]) {
					sb.append("-\n");
					top--;
					idxSeq++;
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
