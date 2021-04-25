import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"Soongsil", "Korea", "Hanyang"};
		int[] part = new int[3];
		int sum = 0, max = 100, index=0;
		
		for (int i = 0; i < 3; i++) {
			part[i] = sc.nextInt();
			sum += part[i];
			max = Math.min(max,part[i]);
		
			if (max == part[i])
				index = i;
		}
		
		if (sum >= 100) {
			System.out.println("OK");
			return;
		}
		System.out.println(name[index]);
		
		
	}

}
