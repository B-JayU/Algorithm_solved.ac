import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long r, c, cctv;
		
		r = sc.nextInt();
		c = sc.nextInt();
		cctv = sc.nextInt();
		
		if (r % cctv != 0) {
			r = r/cctv +1;
		}else {
			r = r/cctv;
		}
		
		if (c % cctv != 0) {
			c = c/cctv +1;
		}else {
			c = c/cctv;
		}
		
		System.out.println(r*c);

	}

}
