package BruteForce;

import java.io.*;
import java.util.*;

public class BOJ_15652 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n,m;
    static int[] selected;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[m+1];
    }

    static void rec_func(int k, int prev){
        if (k == m+1){
            for(int i = 1; i <= m; i++){
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for (int i = prev; i <=n; i++){
                selected[k] = i;
                rec_func(k+1, i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, 1);
        System.out.println(sb.toString());
    }
}
