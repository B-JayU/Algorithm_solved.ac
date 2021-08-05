import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n+1]; num[0] = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int a = 1; a <= n; a++){
            num[a] = Integer.parseInt(st.nextToken());
            num[a] += num[a-1];
        }

        int i, j;
        for (int b = 0; b < m; b++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            bw.write(num[j] - num[i - 1] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
