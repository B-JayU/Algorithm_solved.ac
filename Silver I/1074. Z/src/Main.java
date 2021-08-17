import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	    int N = Integer.parseInt(st.nextToken());
	    int i = Integer.parseInt(st.nextToken());
	    int j = Integer.parseInt(st.nextToken());
	    int result = 0, coef;

	    for (int k = 1; k <= N; k++){
	        coef = (int)Math.pow(Math.pow(2, k-1), 2);
	    	result += coef * (2 * ((i / (int)Math.pow(2, k-1)) % 2) + ((j / (int)Math.pow(2, k-1)) % 2));
        }

	    bw.write(result + "\n");
	    bw.flush();
	    bw.close();
    }
}
