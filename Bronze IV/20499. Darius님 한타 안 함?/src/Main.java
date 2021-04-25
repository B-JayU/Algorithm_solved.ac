import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String line;
		String[] lineVector;
		
		line = sc.nextLine();
		lineVector = line.split("/");
		
		int k = Integer.parseInt(lineVector[0]);
		int d = Integer.parseInt(lineVector[1]);
		int a = Integer.parseInt(lineVector[2]);
		
		if (k+a < d || d == 0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
	}

}
