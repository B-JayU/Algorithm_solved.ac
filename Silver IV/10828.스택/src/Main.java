import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int tries = sc.nextInt();
		int[] stack = new int[tries+1];
		int top=0;
		
		String cmd;
		
		for (int i = 0; i <tries; i++) {
			cmd = sc.next();
			
			if (cmd.compareTo("push") == 0) {
				stack[top++] = sc.nextInt();
			}else if(cmd.compareTo("pop") == 0) {
				if (top == 0)
					sb.append("-1\n");
				else
					sb.append(stack[--top] + "\n");
			}else if(cmd.compareTo("size") == 0) {
				sb.append(top + "\n");
			}else if(cmd.compareTo("empty") == 0) {
				if (top == 0)
					sb.append("1\n");
				else
					sb.append("0\n");
			}else if(cmd.compareTo("top") == 0) {
				if (top==0)
					sb.append("-1\n");
				else
					sb.append(stack[top-1]+"\n");
			}
		}
		System.out.println(sb.toString());
	}

}
