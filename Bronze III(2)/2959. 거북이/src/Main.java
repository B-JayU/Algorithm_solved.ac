import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> toward = new ArrayList<Integer>();
		
		for (int i = 0; i < 4; i++) 
			toward.add(sc.nextInt());
		
		toward.sort(null);
		
		int result = toward.get(0) * toward.get(2);
		System.out.println(result);
		
	}

}
