import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] queue;
	static int front, rear;
	
	public static void push(int n) {
		queue[rear++] = n;
	}
	
	public static int pop() {
		
		if (front==rear)
			return -1;
		else
			return queue[front++];
	}
	
	public static int empty() {
		
		if (front==rear)
			return 1;
		else
			return 0;
	}
	
	public static int front() {
		
		if (front==rear)
			return -1;
		else
			return queue[front];
	}
	
	public static int back() {
		
		if (front==rear)
			return -1;
		else
			return queue[rear-1];
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
			
		int n = Integer.parseInt(br.readLine());
		queue = new int[n];
		String cmd;
		
		front = 0; rear = 0;
		for (int i = 0; i <n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cmd = st.nextToken();
			switch(cmd) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(pop()).append('\n');
					break;
				case "size":
					sb.append(rear-front).append('\n');
					break;
				case "empty":
					sb.append(empty()).append('\n');
					break;
				case "front":
					sb.append(front()).append('\n');
					break;
				case "back":
					sb.append(back()).append('\n');
					break;
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
