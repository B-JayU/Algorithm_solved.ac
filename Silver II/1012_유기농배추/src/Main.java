import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] veget;
    static int[][] visited;
    static int m,n;

    public static void dfs(int y, int x) {
        if (!(x < 0 || x >= n || y <0 || y >= m)){

            if (visited[y][x] == 0 && veget[y][x] == 1) {
                visited[y][x] = 1;

                dfs(y, x-1);
                dfs(y-1, x);
                dfs(y, x+1);
                dfs(y+1, x);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t_case = Integer.parseInt(br.readLine());

        int ans;
        int veg, x,y;


        for (int t = 0; t < t_case; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken()); // 10 -> x
            m = Integer.parseInt(st.nextToken()); // 8 -> y
            veg = Integer.parseInt(st.nextToken());
            ans = 0;

            veget = new int[m][n];
            visited = new int[m][n];
            for (int v = 0; v < veg; v++) {
                st = new StringTokenizer(br.readLine(), " ");
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                veget[y][x] = 1;
            }

            for (int i = 0; i < m; i++) { // 8
                for (int j = 0; j <n; j++) { // 10

                    if (veget[i][j] != 0 && visited[i][j]==0){
                        ans++;
                        //visited[i][j] = 1;
                        dfs(i,j);
                    }
                }
            }
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }
}
