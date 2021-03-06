import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static boolean isPrime(int n) {
		
		if (n == 1)
			return false;
		
		for (int i = 2; i<=(int)Math.sqrt(n); i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num, cnt=0;
		boolean det;
		for (int i = 0; i <n; i++) {
			num = Integer.parseInt(st.nextToken());
			
			det = isPrime(num);
			
			if (det == true)
				cnt++;
		}
		System.out.println(cnt);
	}

}
