import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = 0;
        int current = 0;

        int conf = Integer.parseInt(br.readLine());
        int[][] time = new int[conf][2];

        for (int i = 0; i < conf; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1])
                    return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });

        for (int[] c : time){
            if (current <= c[0]){
                current = c[1];
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();

    }
}
