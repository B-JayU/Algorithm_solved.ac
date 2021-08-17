import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        //int[] heap = new int[n+1];
        int item;

        for (int i = 0; i < n; i++) {
            item = Integer.parseInt(br.readLine());
            if (item == 0){
                if (heap.size() > 0){
                    bw.write(heap.poll() + "\n");
                } else {
                    bw.write("0" +  "\n");
                }
            }

            else{
                heap.add(item);
            }
        }
        bw.flush();
        bw.close();
    }
}
