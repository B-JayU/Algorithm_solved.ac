package TwoPointer_apply;

import java.util.*;
import java.io.*;

public class BOJ_2473 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static long best_sum = Long.MAX_VALUE;
    static int n;
    static int v1, v2, v3;
    static int[] liquid;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        liquid = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            liquid[i] = Integer.parseInt(st.nextToken());
    }

    static void three_liquid(){
        int left, right;
        int target;

        for(int i = 0; i <n; i++){
            left = i+1; right = n-1;
            target = -liquid[i];

            while(left < right){
                if (best_sum > Math.abs(liquid[i] + liquid[left] + liquid[right])) {
                    best_sum = Math.abs(liquid[i] + liquid[left] + liquid[right]);
                    v1 = liquid[i];
                    v2 = liquid[left];
                    v3 = liquid[right];

                    if (best_sum == 0)
                        return;
                }
                if (liquid[left] + liquid[right] < target)
                    left++;
                else if (liquid[left] + liquid[right] > target)
                    right--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(liquid);
        three_liquid();
        sb.append(v1).append(' ').append(v2).append(' ').append(v3);
        System.out.println(sb.toString());
    }
}
