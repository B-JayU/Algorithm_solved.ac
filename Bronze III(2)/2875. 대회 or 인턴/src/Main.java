import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int female = sc.nextInt();
		int male = sc.nextInt();
		int intern = sc.nextInt();
		int diff;
		
		while(intern != 0) {
			
			if (female % 2 == 1) {
				female--;
				intern--;
			}
			
			else if (female > male * 2) {
				diff = (female-male*2);
				
				diff = (intern > diff)? diff : intern;
				female -= diff;
				intern -= diff;
			}
			
			else if (male > female /2) {
				
				diff = (male-female/2);
				
				diff = (intern > diff)? diff : intern;
				male -= diff; 
				intern -= diff;
			}
			
			else if (female == male * 2) {
				male--;
				intern--;
			}
			
			//System.out.println(female + " " + male + " " + intern);
		}
		
		if (female > male*2) {
			System.out.println(male);
		}else {
			if (male >= female/2) {
				System.out.println(female/2);
			}
		}

	}

}
