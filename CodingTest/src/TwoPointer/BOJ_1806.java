package TwoPointer;

import java.util.*;
import java.io.*;

public class BOJ_1806 {

    static BufferedReader br;
    static StringTokenizer st;

    static int n, s, L, R, res = 100000;
    static int[] num;


    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        num = new int[n+1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <=n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

    }

    static void partial_sum(){
        int R = 0, sum = 0, ans = n + 1;
        for (int L = 1; L <= n; L++) {
            // L - 1 을 구간에서 제외하기
            sum -= num[L - 1];

            // R 을 옮길 수 있을 때 까지 옮기기
            while (R + 1 <= n && sum < s)
                sum += num[++R];

            // [L ... R] 의 합, 즉 sum이 조건을 만족하면 정답 갱신하기
            if (sum >= s)
                ans = Math.min(ans, R - L + 1);
        }

        // ans 값을 보고 불가능 판단하기
        if (ans == n + 1)
            ans = 0;
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        input();
        L = R = 1;
        partial_sum();
    }
}
