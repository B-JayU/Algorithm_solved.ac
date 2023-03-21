package TwoPointer_apply;

import java.util.*;
import java.io.*;

public class BOJ_13144 {

    static BufferedReader br;
    static StringTokenizer st;

    static int n;
    static long res;
    static int[] num, count;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        num = new int[n+1];
        count = new int[100001];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i =1; i <= n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void LOUN(){
        int left = 1, right = 0, length;

        while(left <= n){

            while (right < n && count[num[right+1]] == 0)
                count[num[++right]] = 1;

            res += right - left + 1;

            count[num[left++]]--;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        LOUN();
        System.out.println(res);
    }
}
