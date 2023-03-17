import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static int conn_elem = 0;
    static int n, m;
    static int[] visited = new int[n+1];

    public static void connected(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        int temp;
        while(!q.isEmpty()){
            temp = q.poll();

            if (visited[temp] == 0){
                visited[temp] = 1;
                for (int i = 1; i <= n; i++){
                    if (graph[temp][i] == 1 && visited[i] == 0)
                        q.add(i);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	    n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());

	    graph = new int[n+1][n+1];
	    visited = new int[n+1];
	    int x, y;

	    for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
	        x = Integer.parseInt(st.nextToken());
	        y = Integer.parseInt(st.nextToken());

	        graph[x][y] = 1;
	        graph[y][x] = 1;
        }

	    for (int i = 1; i <= n; i++){
	        if (visited[i] != 0)
	            continue;
	        else{
                connected(i);
                conn_elem++;
            }
        }
	    System.out.println(conn_elem);
    }
}
