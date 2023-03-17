import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        TreeMap<Integer, Integer> que = new TreeMap<>();

        int t_case = Integer.parseInt(br.readLine());
        int k, n;
        String cmd;

        for (int i = 0; i < t_case; i++) {
            k = Integer.parseInt(br.readLine());
            for (int m = 0; m < k; m++) {
                st = new StringTokenizer(br.readLine(), " ");
                cmd = st.nextToken();
                n = Integer.parseInt(st.nextToken());

                if (cmd.compareTo("D") == 0){
                    if (que.size() == 0) // 삭제하려는데 큐가 비어있으면 무시
                        continue;
                    else{
                        int num = n==1? que.lastKey():que.firstKey();
                        if (que.put(num, que.get(num) - 1) == 1)
                            que.remove(num);
                    }
                }else if(cmd.compareTo("I") == 0){
                    que.put(n, que.getOrDefault(n,0) + 1);
                }
            }

            if (que.size()==0)
                bw.write("EMPTY" + "\n");
            else
                bw.write(que.lastKey() + " " + que.firstKey() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
