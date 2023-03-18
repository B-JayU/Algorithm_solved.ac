package SortApplication;

import java.util.*;
import java.io.*;

public class BOJ_15970 {
    static BufferedReader br;
    static StringTokenizer st;

    static int n, l, c, len, sum, m;
    static ArrayList<Integer>[] dot;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        dot = new ArrayList[n+1];

        for (int color = 1; color <= n; color++)
            dot[color] = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            l = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            dot[c].add(l);
        }
    }

    static void direction_mark(){
        for (int i = 1; i <= n; i++){
            len = dot[i].size();

            if (len == 0)
                continue;


            sum += (dot[i].get(1) - dot[i].get(0));
            sum += (dot[i].get(len-1) - dot[i].get(len-2));

            if (len < 3)
                continue;

            for (int j = 1; j < len-1; j++){
                m = Math.min(dot[i].get(j) - dot[i].get(j - 1), dot[i].get(j + 1) - dot[i].get(j));
                sum+=m;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        for (int i = 1; i <= n; i++)
            Collections.sort(dot[i]);
        direction_mark();
        System.out.println(sum);
    }
}
