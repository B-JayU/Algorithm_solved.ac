import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int person = Integer.parseInt(br.readLine());

        ArrayList<Integer> time = new ArrayList<Integer>();

        time.add(0);
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < person; i++)
            time.add(Integer.parseInt(st.nextToken()));

        time.sort(null);

        int total = 0;
        for (int i = 1; i <= person; i++){
            time.set(i, time.get(i-1)+time.get(i));
            total += time.get(i);
        }

        bw.write(total + "\n");

        bw.flush();
        bw.close();
    }
}
