import java.util.Scanner;

class basket{
	
	int apples;
	int oranges;
	
	basket() {
		apples = 0;
		oranges = 0;
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		basket A = new basket();
		basket B = new basket();
		
		A.apples = sc.nextInt();
		A.oranges = sc.nextInt();
		
		B.apples = sc.nextInt();
		B.oranges = sc.nextInt();
		
		if (A.apples+B.oranges <= A.oranges+B.apples) {
			System.out.println(A.apples+B.oranges);
		}else {
			System.out.println(A.oranges+B.apples);
		}
	}
	
}
