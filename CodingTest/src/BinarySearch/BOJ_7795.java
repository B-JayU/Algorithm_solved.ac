package BinarySearch;

import java.util.*;
import java.io.*;

public class BOJ_7795 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int tc, n, m;
    static int[] A, B;


    static void input() throws IOException {
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = new int[n+1];
        B = new int[m+1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++)
            A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= m; i++)
            B[i] = Integer.parseInt(st.nextToken());
    }

    static int lowerbound(int[] ary, int L, int R, int X){
        int result = L-1, mid;

        while(L <= R){
            mid = (L+R)/2;
            if (ary[mid] < X){
                result = mid;
                L = mid+1;
            }else {
                R = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        tc = Integer.parseInt(st.nextToken());


        int sum, ret=0;

        for (int i = 0; i < tc; i++){
            input();
            Arrays.sort(A);
            Arrays.sort(B);
            sum =  0;

            for (int j = 1; j <= n; j++){
                ret = lowerbound(B, 1, m, A[j]);
                sum += ret;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }
}
