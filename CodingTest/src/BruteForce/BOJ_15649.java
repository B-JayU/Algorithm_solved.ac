package BruteForce;

import java.io.*;
import java.util.*;

public class BOJ_15649 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int n,m;
    static int[] selected, isUsed;

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[m+1];
        isUsed = new int[n+1];
    }

    static void rec_func(int k){
        if (k == m+1){
            for(int i = 1; i <= m; i++)
                sb.append(selected[i]).append(" ");
            sb.append("\n");
        }
        else{
            for(int i = 1; i<=n; i++){
                if (isUsed[i] == 1) continue;

                selected[k] = i; isUsed[i] = 1;
                rec_func(k+1);
                isUsed[i] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
