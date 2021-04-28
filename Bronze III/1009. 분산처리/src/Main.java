import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for (int i = 0; i < test_case; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			switch(a%10) {
//				case 0:
//					System.out.println("0");
//					break;
				
				case 1:
					System.out.println("1");
					break;
				
				case 2:
					switch(b%4) {
						case 0:
							System.out.println("6");
							break;
						case 1:
							System.out.println("2");
							break;
						case 2:
							System.out.println("4");
							break;
						case 3:
							System.out.println("8");
							break;
					}
					break;
					
				case 3:
					switch(b%4) {
						case 0:
							System.out.println("1");
							break;
						case 1:
							System.out.println("3");
							break;
						case 2:
							System.out.println("9");
							break;
						case 3:
							System.out.println("7");
							break;
					}
					break;
				
				case 4:
					switch(b%2) {
						case 0:
							System.out.println("6");
							break;
						case 1:
							System.out.println("4");
							break;
					}
					break;
				
				case 5:
					System.out.println("5");
					break;
				
				case 6:
					System.out.println("6");
					break;
					
				case 7:
					switch(b%4) {
						case 0:
							System.out.println("1");
							break;
						case 1:
							System.out.println("7");
							break;
						case 2:
							System.out.println("9");
							break;
						case 3:
							System.out.println("3");
							break;	
					}
					break;
					
				case 8:
					switch(b%4) {
						case 0:
							System.out.println("6");
							break;
						case 1:
							System.out.println("8");
							break;
						case 2:
							System.out.println("4");
							break;
						case 3:
							System.out.println("2");
							break;	
					}
					break;
					
				case 9:
					switch(b%2) {
						case 0:
							System.out.println("1");
							break;
						case 1:
							System.out.println("9");
							break;
					}
					break;
				
				default:
					System.out.println("10");
			}
		}
	}
}
