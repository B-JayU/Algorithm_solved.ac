import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dest = sc.nextInt();
		int cur = 1, i = 1;
		
		while(dest > cur) {
			cur += 6*i;
			i++;
		}
		
		System.out.println(i);
	}

}
