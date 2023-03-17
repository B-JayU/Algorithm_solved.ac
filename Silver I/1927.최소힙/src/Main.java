import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        int num;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());

            if (num == 0){
                int temp;
                if (minHeap.isEmpty())
                    bw.write("0" + "\n");
                else{
                    temp=minHeap.poll();
                    bw.write(temp + "\n");
                }

            }
            else
                minHeap.add(num);
        }

        bw.flush();
        bw.close();


    }
}
