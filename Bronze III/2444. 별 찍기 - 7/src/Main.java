import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i =1; i <= n; i++) {
			
			// 왼쪽 여백 출력하기
			print_blank(n, i);
			
			// 별 찍기
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for (int i = n-1; i >= 1; i--) {
			// 왼쪽 여백 출력하기
			print_blank(n, i);
						
			// 별 찍기
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print("*");
						
				System.out.println();
			}
	}
	
	public static void print_blank(int lines ,int level) {
		for (int j = 1; j <= lines-level; j++)
			System.out.print(" ");
	}

}