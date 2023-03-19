package BinarySearch;

import java.util.*;
import java.io.*;

public class BOJ_2110 {

    static BufferedReader br;
    static StringTokenizer st;

    static int n, m;
    static int[] loc;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        loc = new int[n+1];

        for (int i = 1; i <=n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            loc[i] = Integer.parseInt(st.nextToken());
        }
    }

    static boolean deter(int dist){
        int cnt = 1, last = loc[1];

        for (int i = 2; i <=n; i++){
            if (loc[i] - last >= dist){
                cnt++;
                last = loc[i];
            }
        }

        return cnt >= m;
    }

    static int router(int L, int R){
        int max_dist = 0;
        int mid = L-R;
        while(L <= R){
            if (deter(mid)){
                max_dist = mid;
                L = mid+1;
            }else{
                R = mid-1;
            }
            mid = (L+R)/2;
        }
        return max_dist;
    }
    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(loc);
        System.out.println(router(loc[1], loc[n]));
    }
}
