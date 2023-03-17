import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static boolean isPrime(int num) {
		
		if (num == 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		boolean result;
		
		for (int i = start; i <= end; i++) {
			result = isPrime(i);
			
			if (result == true)
				sb.append(i+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
