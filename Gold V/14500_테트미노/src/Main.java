import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int m, n, max = 0;
    static int[][] board, visited;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    public static void tetromino(int row, int col, int order, int s){

        if (row < 0 || row >=n || col < 0 || col >= m)
            return;

        if (visited[row][col] != 0)
            return;

        if (order > 4){
            max = Math.max(max, s);
            return;
        }

        //s+= board[row][col];
        visited[row][col] = 1;

        tetromino(row-1, col, order+1, s+board[row][col]);
        tetromino(row, col-1, order+1, s+board[row][col]);
        tetromino(row+1, col, order+1, s+board[row][col]);
        tetromino(row, col+1, order+1, s+board[row][col]);
        visited[row][col] = 0;
    }

    public static void Exception(int x, int y) {
        int wing = 4;    // 가운데에서의 상하좌우 날개
        int min = Integer.MAX_VALUE;
        int sum = board[x][y];
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            //날개가 2개이상 없다면 ㅗ 모양이 아니다. 그러므로 함수를 종료한다.
            if (wing <= 2)
                return;
            //날개가 맵 바깥에 있다면 날개가 아니다.
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                wing--;
                continue;
            }
            min = Math.min(min, board[nextX][nextY]);
            sum = sum + board[nextX][nextY];
        }
        //날개가 4개일때 가장 작은 날개를 없애야 ㅗ,ㅏ,ㅓ,ㅜ 모양이 나온다.
        if (wing == 4) {
            sum = sum - min;
        }
        max = Math.max(max, sum);
    }

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new int[n][m];

        for (int r = 0; r < n; r++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int c = 0; c < m; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c<m; c++) {
                tetromino(r,c,1, 0);
                Exception(r,c);
            }
        }

        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
}
