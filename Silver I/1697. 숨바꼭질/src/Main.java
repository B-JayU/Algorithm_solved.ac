import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int[] check = new int[100001];

    public static void bfs(int num) {

        Queue<Integer> q = new LinkedList<>();
        q.add(num);

        int temp, next;
        while(!q.isEmpty()){
            temp = q.poll();

            if (temp == k){
                System.out.println(check[temp]);
                return;
            }


            for (int i = 0; i < 3; i++) {

                if (i == 0){
                    next = temp -1;
                }else if(i == 1){
                    next = temp +1;
                }else
                    next = 2*temp;

                if (next >= 0 && next < 100001 && check[next] == 0){
                    q.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	    n = Integer.parseInt(st.nextToken());
	    k = Integer.parseInt(st.nextToken());

	    bfs(n);

    }
}
