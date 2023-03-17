/*
    9461. 파도반 수열
        Method 1. circular queue를 이용하기
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //int front=0, rear=4;
        long[] k = new long[5];

        int t_case = Integer.parseInt(br.readLine());

        for (int i = 0; i<t_case; i++) {
            k[0] = 1; k[1] = 1; k[2] =1; k[3] = 2; k[4] = 2;
            int p_value = Integer.parseInt(br.readLine());
            if (p_value <6)
                bw.write(k[p_value-1] + "\n");
            else{
                for (int j = 5; j < p_value; j++){
                    k[j%5] = k[j%5] + k[(j-1)%5];
                }
                bw.write(k[(p_value-1)%5] + "\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
