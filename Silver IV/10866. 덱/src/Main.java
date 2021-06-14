import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	
	static ArrayList<Integer> deque;
	
	public static void push_front(int v) {
		deque.add(0, v);
	}
	
	public static void push_back(int v) {
		deque.add(v);
	}
	
	public static int pop_front() {
		
		if (deque.size() == 0)
			return -1;

		return deque.remove(0);
	}
	
	public static int pop_back() {
		
		if (deque.size() == 0)
			return -1;
		
		return deque.remove(deque.size()-1);
	}
	
	public static int get_size() {
		return deque.size();
	}
	
	public static int empty() {
		if (deque.isEmpty())
			return 1;
		else
			return 0;
	}
	
	public static int front() {
		
		if (deque.size() == 0)
			return -1;

		return deque.get(0);
	}
	
	public static int back() {
		
		if (deque.size() == 0)
			return -1;
		
		return deque.get(deque.size()-1);
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String cmd;
		
		int n = Integer.parseInt(br.readLine());
		int value, returnV;
		deque = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cmd = st.nextToken();
			
			switch(cmd) {
				case "push_front" :
					value = Integer.parseInt(st.nextToken());
					push_front(value);
					break;
				
				case "push_back" :
					value = Integer.parseInt(st.nextToken());
					push_back(value);
					break;
					
				case "pop_front" :
					returnV = pop_front();
					sb.append(returnV + "\n");
					break;
					
				case "pop_back" :
					returnV = pop_back();
					sb.append(returnV + "\n");
					break;
					
				case "size" :
					returnV = get_size();
					sb.append(returnV + "\n");
					break;
				
				case "empty" :
					returnV = empty();
					sb.append(returnV + "\n");
					break;
					
				case "front" :
					returnV = front();
					sb.append(returnV + "\n");
					break;
				
				case "back" :
					returnV = back();
					sb.append(returnV + "\n");
					break;
					
			}
		}
		System.out.println(sb.toString());
	}

}
