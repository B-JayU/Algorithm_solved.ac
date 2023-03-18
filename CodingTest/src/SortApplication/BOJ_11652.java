package SortApplication;

import java.util.*;
import java.io.*;

public class BOJ_11652 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int n, modeCnt, curCnt;
    static long mode;

    static long[] num;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        num = new long[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            num[i] = Long.parseLong(st.nextToken());
        }
    }

    static void card(int size){
        mode = num[0];
        modeCnt = 1;
        curCnt = 1;

        for (int i = 1; i < n; i++){
            while (i < n && num[i] == num[i-1]){
                curCnt++;
                i++;
            }

            if (curCnt > modeCnt){
                modeCnt = curCnt;
                mode = num[i-1];
            }
            curCnt = 1;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(num);
        card(n);
        System.out.println(mode);
    }
}
