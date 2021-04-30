import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String input = sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(input, " ");
		
		System.out.println(st.countTokens());
		
	}

}
