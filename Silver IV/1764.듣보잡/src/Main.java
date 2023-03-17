import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> noHear = new HashSet<String>();
        Set<String> noSee = new HashSet<String>();
        Set<String> interS = new HashSet<String>();

        for (int i = 0; i < n; i++)
            noHear.add(br.readLine());

        for (int j = 0; j < m; j++)
            noSee.add(br.readLine());

        interS = noHear;
        interS.retainAll(noSee);

        List<String> ary = new ArrayList<String>(interS);
        ary.sort(null);
        List.sort(ary, null);

        bw.write(ary.size() + "\n");
        for (String str : ary){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}
