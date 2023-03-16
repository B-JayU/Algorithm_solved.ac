package BruteForce;

import java.io.*;
import java.util.*;
public class BOJ_15651 {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br;
    static StringTokenizer st;
    static int n, m;
    static int[] selected;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[n+1];
    }

    static void rec_func(int k){
        if (k == m+1) {
            for(int i = 1; i <= m; i++){
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for(int i = 1; i <= n; i++){
                selected[k] = i;
                rec_func(k+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
