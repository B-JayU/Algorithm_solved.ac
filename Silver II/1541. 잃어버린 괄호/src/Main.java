import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");
        StringTokenizer st2;
        int total = 0;
        boolean first_term = false;

        while(st1.hasMoreTokens()){
            st2 = new StringTokenizer(st1.nextToken(), "+");

            int partial = 0;
            while(st2.hasMoreTokens()){
                partial += Integer.parseInt(st2.nextToken());
            }

            if (!first_term){
                total = partial;
                first_term = true;
                continue;
            }
            total -= partial;
        }

        bw.write(total + "\n");
        bw.flush();
        bw.close();
    }
}
