import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		int h, w, n, roomNum;
		
		for (int i = 0; i < t_case; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			roomNum = 0;
			
			roomNum += ((n-1)%h +1)*100;
			
			if (n % h == 0)
				roomNum += n/h;
			else
				roomNum += n/h+1;
		
			System.out.println(roomNum);
		}
	}

}