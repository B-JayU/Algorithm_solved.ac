import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, spaceCnt;
		
		while(true) {
			int num = sc.nextInt();
			width = 0;
			spaceCnt = 0;
			
			if (num == 0)
				break;
			
			while(num > 0) {
				int n = num % 10;
				
				if (n == 1) 
					width += 2;
				else if (n == 0)
					width += 4;
				else
					width += 3;
				
				if (num >= 10)
					spaceCnt++;
				
				num /= 10;
				
			}
			
			width += 2; // 오른쪽, 왼쪽 경계 여백
			width += spaceCnt;
			System.out.println(width);
		}
	}
}
