import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int dot = 0;
		
		for (int i = 0; i <=size; i++) {
			for (int j = i; j <= size; j++) {
				dot += (i + j);
			}
		}
		
		System.out.println(dot);
	}

}
