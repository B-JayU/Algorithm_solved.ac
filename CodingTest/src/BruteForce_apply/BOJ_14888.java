package BruteForce_apply;

import java.util.*;
import java.io.*;
public class BOJ_14888 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n, sum;
    static int[] a, n_oper, selected;
    static int initial=1, max, min;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        a = new int[n+1];

        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        n_oper = new int[5];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <5; i++){
            n_oper[i] = Integer.parseInt(st.nextToken());
        }

        selected = new int[n+1];
    }

    static void ref_func(int k){
        if (k == n){
            sum = a[1];
            for(int i = 1; i < n; i++){
                if (selected[i] == 1){
                    sum += a[i+1];
                }
                else if (selected[i] == 2){
                    sum -= a[i+1];
                }
                else if (selected[i] == 3){
                    sum *= a[i+1];
                }
                else if (selected[i] == 4){
                    if (sum < 0){
                        sum = -((-sum) / a[i+1]);
                    }else{
                        sum /= a[i+1];
                    }
                }
            }

            if (initial == 1){
                max = sum;
                min = sum;
                initial = 0;
            }else {
                if (sum > max) {
                    max = sum;
                }

                if (sum < min) {
                    min = sum;
                }
            }
            return;
        }

        for (int i = 1; i <= 4; i++){
            if (n_oper[i] > 0){
                selected[k] = i;
                n_oper[i]--;

                ref_func(k+1);
                n_oper[i]++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        ref_func(1);
        sb.append(max);
        sb.append("\n");
        sb.append(min);
        System.out.println(sb.toString());
    }
}
