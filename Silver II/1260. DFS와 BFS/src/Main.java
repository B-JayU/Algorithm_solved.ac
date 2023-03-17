import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static int[] visited;
    static int n;
    static int[] stack, queue;
    static int top, front, rear;
    static BufferedReader br;
    static BufferedWriter bw;


    public static void dfs(int v) throws IOException {
        stack[++top] = v;
        int vertex = stack[top--];
        bw.write(vertex+" ");

        visited[vertex] = 1;

        for (int i = 1; i <= n; i++){
            if (graph[vertex][i] == 1 && visited[i]==0)
                dfs(i);
        }
    }

    public static void bfs() throws IOException {
        //queue[rear++] = v;
        int vertex = queue[front++];
        bw.write(vertex+" ");

        visited[vertex] =1;
        for (int i =1; i <=n; i++){
            if (graph[vertex][i] == 1 && visited[i] == 0) {
                queue[rear++] = i;
                visited[i] = 1;
            }
        }
        if (front != rear)
            bfs();
    }

    public static void main(String[] args) throws IOException {

         br = new BufferedReader(new InputStreamReader(System.in));
         bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st;

         st = new StringTokenizer(br.readLine(), " ");
         n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());
         int v = Integer.parseInt(st.nextToken());

         graph = new int[n+1][n+1];
         stack = new int[n+1];
         queue = new int[n+1];

         for (int e = 0; e <m; e++) {
             st = new StringTokenizer(br.readLine(), " ");
             int v1 = Integer.parseInt(st.nextToken());
             int v2 = Integer.parseInt(st.nextToken());

             graph[v1][v2] = 1;
             graph[v2][v1] = 1;
         }

         top = -1;
         front = 0;
         rear = 0;

         visited = new int[n+1];
         dfs(v);
         bw.write("\n");

        top = -1;
        front = 0;
        rear = 0;

        visited = new int[n+1];
         queue[rear++] = v;
         bfs();
         bw.write("\n");

         bw.flush();
         bw.close();
    }
}
