import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double seven25_x, seven25_y;
		double min_price, price;
		
		seven25_x = sc.nextInt();
		seven25_y = sc.nextInt();
		
		min_price = 1000 * seven25_x /seven25_y;
		
		int conv_num = sc.nextInt();
		
		for (int i = 0; i < conv_num; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			price = 1000 * x / y;
			
			if (min_price > price)
				min_price = price;
		}
		
		System.out.printf("%.2f\n", min_price);
	}

}
