import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int birthY = sc.nextInt();
		int birthM = sc.nextInt();
		int birthD = sc.nextInt();
		
		int standY = sc.nextInt();
		int standM = sc.nextInt();
		int standD = sc.nextInt();
		
		// 만 나이 계산하기
		if (standY - birthY == 0)
			System.out.println(standY-birthY);
		else { // 출생연도와 기준연도가 다를 떄
			if (standM > birthM) {
				System.out.println(standY-birthY);
			}else if(standM < birthM){
				System.out.println(standY-birthY-1);
			}else { // 연도와 달이 일치할 때,
				if (standD >= birthD) {
					System.out.println(standY-birthY);
				}else {
					System.out.println(standY-birthY-1);
				}
			}
		}
		
		// 세는 나이
		System.out.println(standY-birthY+1);
			
		// 연 나이
		System.out.println(standY-birthY);
	}

}
