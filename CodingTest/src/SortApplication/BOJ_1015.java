package SortApplication;

import java.util.*;
import java.io.*;


public class BOJ_1015 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int n;
    static int[] a, p;
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        a = new int[n];
        p = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i <n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void calc(){
        int count;

        for (int i = 0; i < n; i++){
            count = 0;
            for (int j = 0; j <i; j++){
                if (a[i] >= a[j])
                    count++;
            }
            for (int j = i+1; j < n; j++){
                if (a[i] > a[j])
                    count++;
            }
            p[i] = count;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        calc();
        for (int i = 0; i < n; i++)
            sb.append(p[i]).append(" ");
        System.out.println(sb.toString());
    }
}
