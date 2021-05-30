import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int avail = 1;
		int tab = sc.nextInt();
		int cnt_plug;
		
		for (int i = 0; i < tab; i++) {
			cnt_plug = sc.nextInt();
			
			avail = avail - 1 + cnt_plug;
		}
		
		System.out.println(avail);
	}

}
