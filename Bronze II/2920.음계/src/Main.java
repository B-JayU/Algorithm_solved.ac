import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] melody = new int[8];
		boolean ascending = false; 
		boolean descending = false;
		
		for (int i = 0; i < 8; i++)
			melody[i] = sc.nextInt();

		for (int i = 0; i < 7; i++) {
			if (melody[i] < melody[i+1])
				ascending = true;
			if (melody[i] > melody[i+1])
				descending = true;
		}
		
		if (ascending == true && descending == false)
			System.out.println("ascending");
		else if (ascending == false && descending == true)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}
