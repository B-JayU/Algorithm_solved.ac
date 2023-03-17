import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t_case = Integer.parseInt(br.readLine());
		
		int[][] f = new int [41][2];
		
		f[0][0] = 1; f[0][1] = 0;
		f[1][0] = 0; f[1][1] = 1;
		int cur = 1;
		
		for (int i = 0; i < t_case; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if (!(f[n][0] == 0 && f[n][1] == 0)) {
				bw.write(f[n][0] + " " + f[n][1] + "\n");
				continue;
			}
			
			for (int j = cur+1; j <= n; j++) {
				f[j][0] = f[j-1][0] + f[j-2][0];
				f[j][1] = f[j-1][1] + f[j-2][1];
			}
			cur = n;
			bw.write(f[n][0] + " " + f[n][1] + "\n");
			
		}
		
		bw.flush();
		bw.close();
		
		
	}
}
