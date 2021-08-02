import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] number = new int[1000001];
		int a,b;
		number[1] = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= n; i++) {
			
			if (i%6 == 0) {
				a = Math.min(number[i-1], number[i/2]) + 1;
				b = Math.min(number[i-1], number[i/3]) + 1;
				number[i] = Math.min(a, b);
			}
			else if (i%2 == 0) {
				number[i] = Math.min(number[i-1], number[i/2]) + 1;
			}
			else if (i %3 == 0) {
				number[i] = Math.min(number[i-1], number[i/3]) + 1;
				
			}else {
				number[i] = number[i-1] + 1;
			}
		}
		
		bw.write(number[n] + "\n");
		bw.flush();
		bw.close();
		
	}

}
