import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        HashMap<String, String> map = new HashMap<>();
        

        int n,m, cur;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        String site, pw, site_f;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
           
            site = st.nextToken();
            pw = st.nextToken();
            
            map.put(site, pw);
        }

        for (int j = 0; j <m; j++) {
            site_f = br.readLine();

           bw.write(map.get(site_f) + "\n");
        }

        bw.flush();
        bw.close();

    }
}
