package BruteForce_apply;

import java.util.*;
import java.io.*;

public class BOJ_9663 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n, ans;
    static int[] column, isUsed;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());

        column = new int[n+1];
        isUsed = new int[n+1];
    }

    static boolean valid(int k){
        int sum_i, sum_j;
        int substract_i, substract_j;

        for (int i = 1; i < k; i++){
            for (int j = i+1; j <= k; j++){
                sum_i = i + column[i];
                sum_j = j + column[j];
                substract_i = i - column[i];
                substract_j = j - column[j];

                if (sum_i == sum_j || substract_i == substract_j)
                    return false;
            }
        }
        return true;
    }

    static void n_queen(int k){
        if (k == n+1){
                ans++;
        }
        else{
            for (int i = 1; i <=n; i++){
                if (isUsed[i] == 0){
                    column[k] = i;
                    isUsed[i] = 1;

                    if (valid(k)){
                        n_queen(k+1);
                    }

                    isUsed[i] = 0;;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        input();
        n_queen(1);
        System.out.println(ans);
    }
}
