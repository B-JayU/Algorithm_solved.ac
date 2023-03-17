import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sci = new int[4];
		int[] soc = new int[2];
		int min_sci = 100, min_soc = 100;
		int sum_sci = 0, sum_soc = 0;
		
		for (int i = 0; i <4; i++) {
			sci[i] = sc.nextInt();
			sum_sci += sci[i];
			
			if (min_sci > sci[i])
				min_sci = sci[i];
		}
			
		for (int i = 0; i<2; i++) {
			
			soc[i] = sc.nextInt();
			
			sum_soc += soc[i];
			
			if (min_soc > soc[i])
				min_soc = soc[i];
		}
		
		System.out.println(sum_sci-min_sci+sum_soc-min_soc);
	}

}
