import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int pocket = Integer.parseInt(st.nextToken());
        int prob = Integer.parseInt(st.nextToken());

        Map<String, String> pocketmon = new HashMap<String, String>();

        String  key, value;
        for (int i = 0; i < pocket; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            key = String.valueOf(i+1);
            value = st.nextToken();

            pocketmon.put(key, value);
            pocketmon.put(value, key);
        }

        String find;
        for (int i = 0; i < prob; i++) {
            find = br.readLine();

            bw.write(pocketmon.get(find) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
