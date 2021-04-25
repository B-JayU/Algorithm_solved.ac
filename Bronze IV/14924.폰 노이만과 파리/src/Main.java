import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int speed_train = sc.nextInt();
		int speed_fly = sc.nextInt();
		int distance = sc.nextInt();
		
		int time = distance/(speed_train*2);
		System.out.println(speed_fly * time);

	}

}
